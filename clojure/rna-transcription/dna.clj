(ns dna
  (:require [clojure.string :as string]))

(defn to-rna [strand]
  (let [thymidine "T"
        uracil "U"]
  (string/replace strand thymidine uracil)))





