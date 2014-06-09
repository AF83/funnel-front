(defproject funnel-front "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"
            :distribution :repo}

  :min-lein-version "2.3.4"

  :source-paths ["src/clj" "src/cljs"]

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [om "0.5.0"]]

  :plugins [[lein-cljsbuild "1.0.2"]
            [lein-bower "0.5.0"]]

  :hooks [leiningen.cljsbuild]

  :cljsbuild
  {:builds {:funnel-front
            {:source-paths ["src/cljs"]
             :compiler
             {:output-to "dev-resources/public/js/funnel_front.js"
              :optimizations :advanced
              :pretty-print false}}}}

  :bower-dependencies [[react "0.10.0"]
                       [foundation "5.2.3"]]

  :bower {:directory "dev-resources/public/vendor"})
