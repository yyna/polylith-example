(ns greenlabs.sms.core)

(defn send-verification-code
  [_phone-number verification-code]
  (format "π°π· μΈμ¦ λ²νΈλ %s μλλ€." verification-code))


(comment
  (send-verification-code "010-9999-0000" 333999))
