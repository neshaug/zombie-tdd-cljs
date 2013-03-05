(defproject zombietddcljs "0.1.0-SNAPSHOT"
  :source-paths ["src-clj"]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.0.4"]
                 [com.cemerick/piggieback "0.0.4"]]
  :plugins [[lein-cljsbuild "0.3.0"]
            [lein-ring "0.7.0"]]
  :hooks [leiningen.cljsbuild]
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  :cljsbuild {:repl-listen-port 9000
              :repl-launch-commands
              {"chrome" ["google-chrome"]}
              :builds
              [{:source-paths ["src-cljs"]
               :compiler
               {:output-to "resources/public/cljs/main.js"
                :output-dir "resources/public/cljs"
                :optimizations :simple
                :pretty-print true}}]}
  :ring {:handler zombietddcljs.routes/handler})