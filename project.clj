(defproject ring-rest-example "0.1.0-SNAPSHOT"
  :description "Just a simple ring rest example"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [
    [org.clojure/clojure "1.10.1"]
    [ring/ring-core "1.7.1"]
    [ring/ring-jetty-adapter "1.7.1"]
    [compojure "1.6.1"]
  ]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler ring.core/router}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
