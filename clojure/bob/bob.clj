(ns bob
  (:require [clojure.string :as string]))

(defn silent [message]
  (string/blank? message))

(defn shouted [message]
  (and (not (silent message)) (= message (string/upper-case message))))

(defn question [message]
  (= \? (last message)))

(defn response-for[message]
 (cond
   (shouted message) "Woah, chill out!"
   (question message) "Sure."
   (silent message) "Fine. Be that way!"
   :else "Whatever."))

