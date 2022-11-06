(ns greenlabs.weather.core
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]))

(def file-path "weather/list.edn")
(def weather-list (->> file-path
                       io/resource
                       slurp
                       edn/read-string))

(defn get-weather
  [date]
  (->> weather-list
       (filter #(= date (:date %)))
       first))

(comment
  (get-weather "2022-11-07"))
