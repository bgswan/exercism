(ns dna)

(defn- thymidine-to-uracil [n]
  (if (= n \T) \U n))

(defn to-rna [strand]
  (apply str (map thymidine-to-uracil strand)))





