(ns zombietddcljs.core
    (:require
     [clojure.browser.repl :as repl]))

(defn ^:export connect
  []
  (repl/connect "http://localhost:9000/repl"))