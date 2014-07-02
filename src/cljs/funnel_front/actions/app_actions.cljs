(ns funnel-front.actions.app-actions

  (:use [funnel-front.lib.helpers :only [clog!]]
        [funnel-front.stores.main-store :only [app-state]]))


(defn update-app-state [event]
  (let [data (.parse js/JSON (.-data event))
        queries (.-query_ids data)
        body (.parse js/JSON (.-body data))]
    (reset! app-state
            (update-in @app-state
                       [:queries (keyword (first queries)) :items]
                       conj {:body body}))
    #_(.log js/console "queries: " queries)
    #_(.log js/console "payload " payload)
    #_(.log js/console "atom: " @app-state)))

