(ns ^:figwheel-always tetris.core
  (:require [tetris.world :as world]
            [tetris.view :as view]
            [reagent.core :as reagent]))

(enable-console-print!)

(println "testly test")

(defn on-js-reload []
  (println "Reloaded...")
  (reagent/render-component [view/root-view]
                            (. js/document (getElementById "app"))))

(defn init []
  (on-js-reload))

(defonce start
  (init))
