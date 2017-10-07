(defproject ix "0.0.0-SNAPSHOT"
            :description "A humble experiment..."
            :url "https://github.com/lovelyKensho/ix"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.8.0"]
                           [proto-repl "0.3.1"]
                           [proto-repl-charts "0.3.2"]]
            :main ^:skip-aot ix.core
            :target-path "target/%s"
            :profiles {:uberjar {:aot :all}})
