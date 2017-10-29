(ns ix.core
  (:gen-class))

;; Import proto-REPL-Charts
(require '[proto-repl-charts.charts :refer :all])

;; --- The start ---

;; Data

(def first-name "Alexander")
(def last-name "Guerra")

(if true
  "Will show if true..."
  "Will show if false")

;; Things I want to do before I die...

(def musical-groups ["The Beatles"
                     "The Clash"
                     "Buzzcocks"
                     "Green Day"
                     "Tom Petty"])

(def foods ["chicken noodle soup"
            "pizza"
            "hamburger"])

(def pearls-of-wisdom ["Do not mutate the state"
                       "Wallet keys phone"
                       "Mad dogs and Englishmen..."
                       "Always have a scratch monkey"])

(def drinks ["water"
             "green tea"
             "sweet tea"
             "wisky"
             "beer"
             "wine"
             "Dr. Pepper"])

(def actors nil)

(def boy-names ["Alexander"
                "John"
                "Adam"])

(def stop-words nil)

;; “This is the worst kind of discrimination there is: the kind against me!”
;; - Bender

;; Hahahahaha. Oh wait you’re serious. Let me laugh even harder.”
;; - Bender

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
