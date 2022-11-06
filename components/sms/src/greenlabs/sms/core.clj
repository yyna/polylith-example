(ns greenlabs.sms.core)

(defn send-sms
  [phone-number message]
  (format "send sms to %s: %s via 🍎" phone-number message))

(comment
  (send-sms "010-9999-0000" "안녕하세요"))
