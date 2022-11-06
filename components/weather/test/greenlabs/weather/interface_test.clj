(ns greenlabs.weather.interface-test
  (:require [clojure.test :as test :refer [deftest is run-tests testing]]
            [greenlabs.weather.interface :as weather]))

(deftest get-weather-test
  (testing "날씨 정보 가져오기 - 성공"
    (is (= {:date        "2022-11-07"
            :temperature 10
            :humidity    30}
           (weather/get-weather "2022-11-07"))))

  (testing "날씨 정보 가져오기 - 없는 날짜"
    (is (nil? (weather/get-weather "2022-11-11")))))

(comment
  (run-tests))
