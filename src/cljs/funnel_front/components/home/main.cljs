(ns funnel-front.components.home.main
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [funnel-front.stores.main-store :as store]))

(defn main-comp [app owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:className "home row"}
        (dom/div #js {:className "query-list small-2 columns"}
          (dom/h1 nil (str "Token: " (:token @store/app-state)))
          (dom/p nil "Query List"))
        (dom/div #js {:className "timeline small-5 columns"}
          (dom/p nil "Timeline"))
        (dom/div #js {:className "item-detail small-5 columns"}
          (dom/p nil "Item Detail"))))))
