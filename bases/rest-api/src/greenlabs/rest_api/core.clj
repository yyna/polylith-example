(ns greenlabs.rest-api.core
  (:gen-class)
  (:require [greenlabs.rest-api.handler :as handler]
            [muuntaja.core :as m]
            [reitit.coercion.spec]
            [reitit.ring :as ring]
            [reitit.ring.coercion :as rrc]
            [reitit.ring.middleware.muuntaja :as muuntaja]
            [reitit.ring.middleware.parameters :as parameters]
            [ring.adapter.jetty9 :refer [run-jetty]]))

(def middlewares [parameters/parameters-middleware
                  rrc/coerce-request-middleware
                  muuntaja/format-middleware
                  muuntaja/format-response-middleware
                  rrc/coerce-response-middleware])

(def app
  (ring/ring-handler
   (ring/router
    [["/user" {}
      ["/register" {:post {:form      {:phone-number string?
                                       :password     string?}
                           :responses {200 {:body {:success boolean?}}
                                       409 {:body {:success boolean?
                                                   :message string?}}}
                           :handler   handler/user-register}}]
      ["/login" {:post {:form      {:phone-number string?
                                    :password     string?}
                        :responses {200 {:body {:success boolean?}}
                                    401 {:body {:success boolean?
                                                :message string?}}}
                        :handler   handler/user-login}}]]
     ["/send-verification-code" {:post {:form      {:phone-number string?}
                                        :responses {200 {:body {:success boolean?}}}
                                        :handler   handler/send-verification-code}}]
     ["/weather" {:get {:parameters {:query {:date string?}}
                        :responses  {200 {:body {:success boolean?}}
                                     404 {:body {:success boolean?
                                                 :message string?}}}
                        :handler    handler/weather}}]]
    {:data {:coercion   reitit.coercion.spec/coercion
            :muuntaja   m/instance
            :middleware middlewares}})))

(defn -main []
  (run-jetty #'app {:port  3000
                    :join? false})
  (println "server running in port 3000"))

(comment
  (-main))
