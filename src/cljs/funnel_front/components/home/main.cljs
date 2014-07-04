(ns funnel-front.components.home.main

  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true])

  (:use [funnel-front.components.home.panel :only [panel]]
        [funnel-front.components.home.columns :only [columns]]))


(defn main-comp [app owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:className "home row"}
        (om/build panel app)
        (om/build columns app)))))
