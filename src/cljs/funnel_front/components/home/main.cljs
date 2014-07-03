(ns funnel-front.components.home.main

  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true])

  (:use [funnel-front.components.home.query-list :only [query-list]]
        [funnel-front.components.home.timeline :only [timeline]]
        [funnel-front.components.home.item-detail :only [item-detail]]))


(defn main-comp [app owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:className "home row"}
        (om/build query-list app)
        (om/build timeline app)
        (om/build item-detail app)))))
