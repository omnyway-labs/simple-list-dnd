(ns app.dnd-cards
  (:require [reagent.core :as r]
            [devcards.core :as dc :refer [defcard deftest]]
            [app.simple-list :as sl]))

(defcard
  "Examples of using React Beautiful DND with Clojurescript")

(defcard dnd-card
  (dc/reagent sl/show-simple-list))
