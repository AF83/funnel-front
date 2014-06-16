(ns funnel-front.components.home.query-list

  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true])

  (:use [funnel-front.stores.main-store :only [app-state]]))

(defn query-list [list owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:className "query-list small-2 columns"}
        (dom/h1 nil (str "Token: " (:token @app-state)))
        (dom/p nil "Query List")))))
