(ns tetris.view
  (:require [clojure.string :as string]
            [tetris.world :as world]))

(enable-console-print!)

(println "trying something else")

(def pieces
  [[[1 1 1 1]]
   [[1 1]
    [1 1]]])

(defn block [x y color]
  [:rect {:x x
          :y y
          :width 1
          :height 1
          :stroke "black"
          :stroke-width 0.01
          :rx 0.1
          :fill (world/colors color)}])

(defn board-view [{:keys [piece color x y]}]
  (let [piece-width (count piece)
        piece-height (count (first piece))]
    (into [:svg {:style {:border "1px solid black"
                         :width 200
                         :height 400}
                 :view-box (string/join " " [0 0 10  20])}]
          (for [i (range piece-width)
                j (range piece-height)
                :when (pos? (get-in piece [i, j]))]
           [block (+ x i) (+ y j) color]))))

(defn root-view []
  (board-view {:piece (first pieces)
               :color 2
               :x 0
               :y 0
               }))
