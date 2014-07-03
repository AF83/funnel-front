(ns funnel-front.components.home.item-detail

  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(defn item-detail [app owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:className "item-detail small-5 columns"}
        (dom/p nil "Item Detail")))))
