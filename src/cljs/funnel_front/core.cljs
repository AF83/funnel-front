(ns funnel-front.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [funnel-front.components.home.main :as home]
            [funnel-front.stores.main-store :as store]
            [figwheel.client :as fw]))


(enable-console-print!)

(om/root
  home/main-comp
  store/app-state
  {:target (. js/document (getElementById "app"))})


