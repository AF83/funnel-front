(ns funnel-front.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [funnel-front.actions.app-actions :as actions])

  (:use [funnel-front.components.home.main :only [main-comp]]
        [funnel-front.lib.helpers :only [event-source]]
        [funnel-front.stores.main-store :only [app-state]]))

(enable-console-print!)

;; Boot app
(om/root
  main-comp
  app-state
  {:target (. js/document (getElementById "app"))})

;; Initialize SSE
(event-source "/river?token=635a3366bbdd4dfaba9df415e51a60e0" actions/update-app-state)

