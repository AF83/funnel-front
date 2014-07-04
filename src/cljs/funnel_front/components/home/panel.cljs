(ns funnel-front.components.home.panel

  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(defn panel [app owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:className "panel"}
        (dom/h1 nil (str "Token: " (:token app)))))))
