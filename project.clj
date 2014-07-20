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
            [lein-bower "0.5.0"]
            [lein-haml-sass "0.2.7-SNAPSHOT"]]

  :hooks [leiningen.cljsbuild]

  :cljsbuild
  {:builds {:funnel-front
            {:source-paths ["src/cljs"]
             :compiler
             {:output-to "resources/public/js/funnel_front.js"
              :output-dir "resources/public/js/out"
              :optimizations :none
              :source-map true
              :pretty-print false}}}}

  ;; Bower

  :bower-dependencies [[react "0.10.0"]]

  :bower {:directory "resources/public/js/out"}

  ;; Sass

  :sass {:src "src/sass"
         :output-directory "resources/public/css"
         :output-extension "css"})
