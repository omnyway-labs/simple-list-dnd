(ns app.dnd-cards
  (:require [devcards.core :as dc :refer [defcard]]
            [app.simple-list :as sl]))

(defcard
  "Examples of using React Beautiful DND with Clojurescript")

(defcard dnd-card
  (dc/reagent sl/show-simple-list))
