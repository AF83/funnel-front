(ns funnel-front.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true])

  (:use [funnel-front.components.home.main :only [main-comp]]
        [funnel-front.stores.main-store :only [app-state]]))

(enable-console-print!)

(om/root
  main-comp
  app-state
  {:target (. js/document (getElementById "app"))})
