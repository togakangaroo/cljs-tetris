(ns tetris.world
  (:require [reagent.core :as reagent]))

(def colors
  ["#181818"
   "#585858"
   "#D8D8D8"
   "#AB4642"
   "#DC9656"
   "#F7CA88"
   "#A1B56C"
   "#86C1B9"
   "#7CAFC2"
   "#BA8BAF"
   "#A16946"])

(defonce app-state
  (reagent/atom {}))
