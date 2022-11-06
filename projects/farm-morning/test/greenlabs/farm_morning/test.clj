(ns greenlabs.farm-morning.test
  (:require [clojure.test :as test :refer [deftest is run-tests testing]]))

(deftest test-in-farm-morning
  (testing "farm-morning project"
    (println "farm-morning project 🇰🇷")
    (is (= true true))))

(comment
  (run-tests))