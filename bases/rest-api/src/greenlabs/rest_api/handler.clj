(ns greenlabs.rest-api.handler
  (:require [greenlabs.user.interface :as user]
            [greenlabs.weather.interface :as weather]))

(defn user-register
  [{{:keys [phone-number password]} :body-params}]
  (println "phone-number password" phone-number password)
  (if (user/register phone-number password)
    {:status 200
     :body   {:success true}}
    {:status 409
     :body   {:success false
              :message "이미 등록된 전화번호입니다."}}))

(defn user-login
  [{{:keys [phone-number password]} :body-params}]
  (if (user/login phone-number password)
    {:status 200
     :body   {:success true}}
    {:status 401
     :body   {:success false
              :message "전화번호 또는 비밀번호가 일치하지 않습니다."}}))

(defn weather
  [{{{:keys [date]} :query} :parameters}]
  (if-let [result (weather/get-weather date)]
    {:status 200
     :body   {:success true
              :result  result}}
    {:status 404
     :body   {:success false
              :message "날씨 정보가 없습니다."}}))