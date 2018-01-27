(ns ix.api.quotes
  (:require [clj-http.client :as client]
            [cheshire.core :refer :all]
            [ix.api.core :as api]))

(def quote-endpoint "https://andruxnet-random-famous-quotes.p.mashape.com/")
(def yoda-speak-endpoint "https://yoda.p.mashape.com/yoda/")

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
  "Returns a random quote"
  []
  (let [response (parse-string (:body (request-a-quote-from-api)) true)
        quote (get response :quote)
        author (get response :author)]
    (str quote " - " author)))

(defn get-a-quote-text
  "Returns a random quote"
  []
  (let [response (parse-string (:body (request-a-quote-from-api)) true)
        quote (get response :quote)
        author (get response :author)]
    (str quote)))

(defn request-yoda-speak-conversion
  [string]
  (str (:body (client/get yoda-speak-endpoint {:timeout 200
                                               :query-params {:sentence string}
                                               :headers {"X-Mashape-Key" "i6KAOadCsMmshDYAdrssA86dZYTip17Az2fjsnCsfIsvF48d7R"
                                                         "Accept" "text/plain"}}))))
(defn yoda-quote
  []
  (let [response (get-a-quote-text)
        converted-text (request-yoda-speak-conversion response)]
    (do (println response)
        (println "\n --> \n")
        (println converted-text))))

(defn get-yoda-quotes
  [number-of-quotes]
  (dotimes [n number-of-quotes] (println (yoda-quote))))
