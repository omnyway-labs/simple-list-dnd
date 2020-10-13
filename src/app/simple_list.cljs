(ns app.simple-list
  (:require
   [reagent.core :as r]
   ["react-beautiful-dnd" :as dnd :refer [DragDropContext Draggable Droppable]]))

(defn adapt [component]
  (try
    (r/adapt-react-class component)
    (catch js/Object e
      (prn e.message))))

(def drag-drop-context (adapt DragDropContext))
(def droppable (adapt Droppable))
(def draggable (adapt Draggable))

(defn getItems
  [count]
  (.map
   (.from js/Array #js {:length count} (fn [v k] k))
   (fn [k] #js {:id (str "item-" k ""), :content (str "item " k "")})))

(defn reorder
  [list startIndex endIndex]
  (let [result    (.from js/Array list)
        [removed] (.splice result startIndex 1)]
    (.splice result endIndex 0 removed)
    result))

(def grid 8)

(defn getItemStyle
  [isDragging draggableStyle]
  (js/Object.assign
   #js
   {:userSelect "none",
    :padding    (* grid 2),
    :margin     (str "0 0 " grid "px 0"),
    :background (if isDragging "lightgreen" "grey")}
   draggableStyle))

(defn getListStyle
  [isDraggingOver]
  #js
  {:background (if isDraggingOver "lightblue" "lightgrey"),
   :padding    grid,
   :width      250})

(def items-state (r/atom (getItems 10)))

(defn on-drag-end [result]
  (when (.-destination result)
    (let [items (reorder @items-state (.. result -source -index) (.. result -destination -index))]
      (reset! items-state items))))

(defn show-simple-list []
  [drag-drop-context
   {:onDragEnd on-drag-end}
   [droppable
    {:droppable-id "droppable"}
    (fn
      [provided snapshot]
      (r/as-element
       [:div
        (merge
         (js->clj (.-droppableProps provided))
         {:ref   (.-innerRef provided),
          :style (getListStyle (:isDraggingOver snapshot))})
        (map-indexed
         (fn
           [index item]
           [draggable
            {:key (.-id item), :draggable-id (.-id item), :index index}
            (fn
              [provided snapshot]
              (r/as-element
               [:div
                (merge
                 (js->clj (.-draggableProps provided))
                 (js->clj (.-dragHandleProps provided))
                 {:ref (.-innerRef provided),
                  :style
                  (getItemStyle (.-isDragging snapshot) (.. provided -draggableProps -style))})
                (.-content item)]))])
         @items-state)
        (.-placeholder provided)]))]])
