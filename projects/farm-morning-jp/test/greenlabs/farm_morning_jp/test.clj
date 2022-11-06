(ns greenlabs.farm-morning-jp.test
  (:require [clojure.test :as test :refer [deftest is run-tests testing]]))

(deftest test-in-farm-morning-jp
  (testing "farm-morning-jp project"
    (println "farm-morning-jp project 🇯🇵")
    (is (= true true))))

(comment
  (run-tests))