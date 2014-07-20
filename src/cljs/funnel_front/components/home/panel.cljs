(ns funnel-front.components.home.panel

  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(defn panel [app owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:id "panel"}
        (dom/a #js {:href "#"}
          (dom/img #js {:src "/images/logo.png" :alt "Funnel Front Logo"}))
        (dom/a #js {:href "#"}
          (dom/img #js {:src "/images/user.png" :alt "User Picto"}))
        (dom/a #js {:href "#"}
          (dom/img #js {:src "/images/search.png" :alt "Search Picto"}))
        (dom/a #js {:href "#"}
          (dom/img #js {:src "/images/list.png" :alt "List Picto"}))
        (dom/a #js {:href "#"}
          (dom/img #js {:src "/images/add.png" :alt "Add Picto"}))
        ))))
