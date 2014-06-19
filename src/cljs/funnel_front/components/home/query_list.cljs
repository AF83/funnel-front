(ns funnel-front.components.home.query-list

  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true])

  (:use [funnel-front.stores.main-store :only [app-state]]))

(defn ^:private query-item [query owner]
  (reify
    om/IRender
    (render [this]
      (dom/li nil (:label query)))))

(defn query-list [list owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:className "query-list small-2 columns"}
        (dom/h1 nil (str "Token: " (:token @app-state)))
        (apply dom/ul nil
          (om/build-all query-item (:queries @app-state)))))))
