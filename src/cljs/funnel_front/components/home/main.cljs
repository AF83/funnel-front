(ns funnel-front.components.home.main
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(defn main-comp [app owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:className "home"}
        (dom/div #js {:className "query-list"})
        (dom/div #js {:className "timeline"})
        (dom/div #js {:className "item-detail"})))))
