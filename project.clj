(defproject clojure-rest "0.1.0-SNAPSHOT"
  :description "A simple project showing how to create a REST API endpoint with Clojure"
  :url "https://github.com/sekibomazic"
  :license {:name "MIT"
            :url "https://github.com/sekibomazic/clojure-rest/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/java.jdbc "0.7.10"]
                 [org.postgresql/postgresql "42.1.4"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-devel "1.6.3"]
                 [ring/ring-json "0.5.0"]
                 [compojure "1.6.1"]
                 [http-kit "2.3.0"]
                 [lynxeyes/dotenv "1.0.2"]]
  :main ^:skip-aot clojure-rest.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all} :dev {:main clojure-rest.core/-dev-main} })
