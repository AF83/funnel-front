(ns funnel-front.actions.app-actions

  (:use [funnel-front.lib.helpers :only [clog!]]
        [funnel-front.stores.main-store :only [app-state]]))


(defn update-app-state [event]
  (let [data (.parse js/JSON (.-data event))
        queries (.-queries data)
        body (.parse js/JSON (.-body data))]
    (.log js/console data)
    (.log js/console "first match :" (.-id (first queries)))
    (swap! app-state
           update-in
           [:queries (keyword (.-id (first queries))) :items]
           conj {:body (js->clj body)})
    (.log js/console @app-state)
    ))

