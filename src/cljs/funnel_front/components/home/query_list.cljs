(ns funnel-front.components.home.query-list

  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [figwheel.client :as fw])

  (:use [funnel-front.stores.main-store :only [app-state]]))

(enable-console-print!)

(defn query-list [list owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:className "query-list small-2 columns"}
        (dom/h1 nil (str "Token: " (:token @app-state)))
        (dom/p nil "Query list")))))

(fw/watch-and-reload :jsload-callback
                     (prn " query list reloaded!"))

