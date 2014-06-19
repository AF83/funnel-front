(ns funnel-front.components.home.timeline

  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(defn timeline [list owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:className "timeline small-5 columns"}
        (dom/p nil "Timeline")))))
