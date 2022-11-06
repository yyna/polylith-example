(ns greenlabs.sms.interface
  (:require [greenlabs.sms.core :as core]))

(defn send-sms
  "문자메시지 전송
   :param phone-number 전화번호
   :param message 메시지"
  [phone-number message]
  (core/send-sms phone-number message))