(ns greenlabs.user.core
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]))

(def file-path "user/list.edn")
(def users (->> file-path
                io/resource
                slurp
                edn/read-string))

(defn- duplicate? [phone-number]
  (some #(= phone-number (:phone-number %)) users))

(defn register
  [phone-number _password]
  (when-not (duplicate? phone-number)
    true))

(defn login
  [phone-number password]
  (some #(and (= phone-number (:phone-number %))
              (= password (:password %))) users))

(comment
  (register "010-1111-9999" "9999")
  (login "010-1111-1111" "1234"))

