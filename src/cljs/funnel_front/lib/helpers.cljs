(ns funnel-front.lib.helpers)

;; https://groups.google.com/forum/#!topic/clojure/ghHqHuXE0pY
(defn clog! [& items-to-print]
  (.log js/console (apply pr-str items-to-print)))

(defn event-source [route callback]
  (let [source (js/EventSource. route)]
    (set! (.-onmessage source) callback)
    source
    ))
