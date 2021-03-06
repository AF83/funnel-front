{:shared {:clean-targets ["out" :target-path]}

 :tdd [:shared
       {:cljsbuild
        {:builds {:funnel-front
                  {:compiler {
                              :optimizations :none
                              :source-map true
                              :pretty-print true}}}}}]

 :dev [:shared
       {:resources-paths ["resources"]
        :source-paths ["resources/tools/http" "resources/tools/repl"]
        :dependencies [[ring "1.2.1"]
                       [compojure "1.1.6"]
                       [hickory "0.5.3"]]
        :plugins [[com.cemerick/austin "0.1.4"]]
        :cljsbuild
        {:builds {:funnel-front
                  {:id "funnel-front dev"
                   :source-paths ["resources/tools/repl"]
                   :compiler {
                              :output-to "resources/public/js/funnel_front.js"
                              :output-dir "resources/public/js/out"
                              :optimizations :none
                              :source-map true
                              :pretty-print true}}}}

        :injections [(require '[ring.server :as http :refer [run]]
                              'cemerick.austin.repls)
                     (defn browser-repl-env []
                       (reset! cemerick.austin.repls/browser-repl-env
                                (cemerick.austin/repl-env)))
                     (defn browser-repl []
                       (cemerick.austin.repls/cljs-repl
                         (browser-repl-env)))]}]}
