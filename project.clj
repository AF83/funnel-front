(defproject funnel-front "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"
            :distribution :repo}

  :min-lein-version "2.3.4"

  :source-paths ["src/clj" "src/cljs"]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2202"]
                 [org.clojure/core.async "0.1.278.0-76b25b-alpha"]
                 [om "0.5.0"]
                 [figwheel "0.1.3-SNAPSHOT"]]


  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-bower "0.5.0"]
            [lein-haml-sass "0.2.7-SNAPSHOT"]
            [lein-figwheel "0.1.3-SNAPSHOT"]]

  :source-paths ["src"]

  :cljsbuild {
              :builds [
                       {:id "funnel-front"
                        :source-paths ["src/cljs"]
                        :compiler {
                                   :output-to "resources/public/js/funnel_front.js"
                                   :output-dir "resources/public/js/out"
                                   :optimizations :none
                                   :source-map true}}]}

  ;; Bower

  :bower-dependencies [[react "0.10.0"]
                       [foundation "5.2.3"]]

  :bower {:directory "resources/public/vendor"}

  ;; Sass

  :sass {:src "src/sass"
         :output-directory "resources/public/css"
         :output-extension "css"}

  ; Figwheel
  :figwheel {
             :css-dirs ["resources/public/css"]
             })

