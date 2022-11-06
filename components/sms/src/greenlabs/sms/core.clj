(ns greenlabs.sms.core)

(defn send-verification-code
  [_phone-number verification-code]
  (format "🇰🇷 인증 번호는 %s 입니다." verification-code))

(comment
  (send-verification-code "010-9999-0000" 333999))
