(ns funnel-front.actions.app-actions

  (:use [funnel-front.lib.helpers :only [clog!]]
        [funnel-front.stores.main-store :only [app-state]]))


(defn update-app-state [event]
  (let [data (->> event (.-data) (js->clj) )]
    (clog! data)
    ;; app state update is in work in progress
    #_(swap! app-state
             update-in
             [:queries (keyword (.-id (first queries))) :items]
             conj {:body (js->clj body)})
    )
  )
