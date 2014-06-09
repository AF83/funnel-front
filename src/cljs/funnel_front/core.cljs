(ns funnel-front.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [funnel-front.components.home.main :as home]))

(enable-console-print!)

(def app-state (atom
  {:text "Hello world!"}))

(om/root
  home/main-comp
  app-state
  {:target (. js/document (getElementById "main"))})
