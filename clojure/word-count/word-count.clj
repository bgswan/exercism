(ns phrase
  (:require [clojure.string :refer [split lower-case]]))

(defn word-count [phrase]
  (let [words (split (lower-case phrase) #"\W+")]
    (frequencies words)))
