(ns funnel-front.components.home.columns

  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

;; Sub components

(defn ^:private item [data owner]
  (reify
    om/IRender
    (render [this]
      (dom/li nil (pr-str data))
      )))

(defn ^:private column [[_ query-data] owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:className "column"}
        (dom/header nil (:label query-data))
        (apply dom/ul nil
          (om/build-all item (:items query-data))))
      )))

;; Columns component

(defn columns [app owner]
  (reify
    om/IRender
    (render [this]
      (apply dom/div #js {:id "columns"}
        (om/build-all column (:queries app)))
      )))
