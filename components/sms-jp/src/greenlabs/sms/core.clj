(ns greenlabs.sms.core)

(defn send-verification-code
  [_phone-number verification-code]
  (format "π―π΅ θͺθ¨Όγ³γΌγγ―%sγ§γγ" verification-code))

(comment
  (send-verification-code "010-9999-0000" 333999))
