(ns funnel-front.components.home.main

  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true])

  (:use [funnel-front.components.home.query-list :only [query-list]]
        [funnel-front.components.home.timeline :only [timeline]]))


(defn main-comp [app owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:className "home row"}
        (om/build query-list nil)
        (om/build timeline nil)
        (dom/div #js {:className "item-detail small-5 columns"}
          (dom/p nil "Item Detail"))))))
