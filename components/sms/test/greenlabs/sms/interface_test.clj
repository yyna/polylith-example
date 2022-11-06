(ns greenlabs.sms.interface-test
  (:require [clojure.test :as test :refer [deftest is run-tests testing]]
            [greenlabs.sms.interface :as sms]))


(deftest send-verification-code-test
  (testing "인증 메시지 전송"
    (is (= "🇰🇷 인증 번호는 123456 입니다." (sms/send-verification-code "010-9999-0000" 123456)))))

(comment
  (run-tests))
