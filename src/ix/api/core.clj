(ns ix.api.core
  (:require [cheshire.core :refer :all]))

;; Need a way to import key

(def X-Mashape-Key (get (parse-string (slurp "keys/mashape.json") true) :X-Mashape-Key))
