(ns funnel-front.lib.helpers)

;; https://groups.google.com/forum/#!topic/clojure/ghHqHuXE0pY
(defn clog! [to-print]
  (.log js/console (pr-str to-print)))

(defn event-source [route callback]
  (let [source (js/EventSource. route)]
    (set! (.-onmessage source) callback)
    source))
