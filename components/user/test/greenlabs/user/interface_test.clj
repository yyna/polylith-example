(ns greenlabs.user.interface-test
  (:require [clojure.test :as test :refer [deftest is run-tests testing]]
            [greenlabs.user.interface :as user]))

(deftest register-test
  (testing "회원가입 성공"
    (is (= true (user/register "010-1111-0000" "8080"))))

  (testing "회원가입 실패 - 중복된 전화번호"
    (is (nil? (user/register "010-1111-3333" "8080")))))

(deftest login-test
  (testing "로그인 성공"
    (is (= true (user/login "010-1111-1111" "1234"))))

  (testing "로그인 실패"
    (is (nil? (user/login "010-1111-1111" "0000")))))

(comment
  (run-tests))
