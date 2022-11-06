(ns greenlabs.user.interface
  (:require [greenlabs.user.core :as core]))

(defn register
  "회원가입
   :param phone-number 전화번호
   :param password 비밀번호
   
   성공시 true, 실패시 nil 반환"
  [phone-number password]
  (core/register phone-number password))

(defn login
  "로그인
   :param phone-number 전화번호
   :param password 비밀번호
   
   성공시 true, 실패시 nil 반환"
  [phone-number password]
  (core/login phone-number password))
