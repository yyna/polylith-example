(ns greenlabs.sms.interface-test
  (:require [clojure.test :as test :refer [deftest is run-tests testing]]
            [greenlabs.sms.interface :as sms]))


(deftest send-sms-test
  (testing "메시지 전송"
    (is (= "send sms to 010-9999-0000: 안녕하세요 via 🍎" (sms/send-sms "010-9999-0000" "안녕하세요")))))

(comment
  (run-tests))
