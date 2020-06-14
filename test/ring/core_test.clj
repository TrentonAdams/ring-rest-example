(ns ring.core-test
  (:require [clojure.test :refer :all]
            [ring.core :refer :all]))

(deftest test-root-handler
  (testing "Should return Hello World"
    (is (= (root-handler {})
          {:status  200
           :headers {"Content-Type" "text/plain"}
           :body    "Hello World"}))
    )
  )

(deftest test-check-ip-handler
  (testing "Should return 127.0.0.1"
    (is (=
          (check-ip-handler {:remote-addr "127.0.0.1"})
          {:status  200
           :headers {"Content-Type" "text/plain"}
           :body    "127.0.0.1"}))
    )
  )

