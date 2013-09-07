(ns bob
  (:require [clojure.string :refer [blank? upper-case]]))

(defn- silent? [message]
  (blank? message))

(defn- shouted? [message]
  (= message (upper-case message)))

(defn- question? [message]
  (= \? (last message)))

(defn response-for[message]
 (cond
   (silent? message) "Fine. Be that way!"
   (shouted? message) "Woah, chill out!"
   (question? message) "Sure."
   :else "Whatever."))

