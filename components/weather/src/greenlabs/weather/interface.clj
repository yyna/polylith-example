(ns greenlabs.weather.interface
  (:require [greenlabs.weather.core :as core]))

(defn get-weather
  "날짜에 해당하는 날씨 정보 조회
   :param date 날짜"
  [date]
  (core/get-weather date))
