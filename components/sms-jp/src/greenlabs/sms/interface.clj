(ns greenlabs.sms.interface
  (:require [greenlabs.sms.core :as core]))

(defn send-verification-code
  "문자메시지 전송
   :param phone-number 전화번호
   :param verification-code 인증번호"
  [phone-number verification-code]
  (core/send-verification-code phone-number verification-code))