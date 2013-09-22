(ns phrase
  (:require [clojure.string :refer [split lower-case]]))

(defn word-count [phrase]
  (let [words (re-seq #"\w+" (lower-case phrase))]
    (frequencies words)))
