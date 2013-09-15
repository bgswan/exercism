(ns phrase
  (:require [clojure.string :refer [split lower-case blank?]]))

(defn word-count [phrase]
  (let [tokens (split (lower-case phrase) #"\W")
        words (remove blank? tokens)]
  (frequencies words)))
