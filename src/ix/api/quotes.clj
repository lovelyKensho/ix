(ns ix.api.quotes
  (:require [clj-http.client :as client]
            [cheshire.core :refer :all]
            [ix.api.core :as api]))

(def quote-endpoint "https://andruxnet-random-famous-quotes.p.mashape.com/")

(defn request-a-quote-from-api
  "Returns a quote"
  []
  (client/get quote-endpoint
              {:headers {"X-Mashape-Key" api/X-Mashape-Key
                         "Content-Type" "application/x-www-form-urlencoded"
                         "Accept" "application/json"}}
              {:client-params {"cat" "movies"}
               "count" 1}))

(defn get-a-quote
  []
  (let [response (parse-string (:body (request-a-quote-from-api)) true)
        quote (get response :quote)
        author (get response :author)]
    (str quote " - " author)))
