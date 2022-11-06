(ns greenlabs.sms.core)

(defn send-verification-code
  [_phone-number verification-code]
  (format "🇯🇵 認証コードは%sです。" verification-code))

(comment
  (send-verification-code "010-9999-0000" 333999))
