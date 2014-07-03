(ns funnel-front.components.home.timeline

  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true])

  (:use [funnel-front.stores.main-store :only [app-state]]))

;; Uitility functions

(defn ^:private current-list-content! []
  (let [current-query ((:current-query @app-state) (:queries @app-state))]
    (:items current-query)))

;; Sub components

(defn ^:private timeline-item [item owner]
  (reify
    om/IRender
    (render [this]
      (dom/li nil (str (into [] item)) ) )))

;; Timeline component

(defn timeline [app owner]
  (reify
    om/IRender
    (render [this]
      (.log js/console "current-list-content" (current-list-content!))
      (dom/div #js {:className "timeline small-5 columns"}
        (apply dom/ul nil
          (om/build-all timeline-item (current-list-content!)))))))
