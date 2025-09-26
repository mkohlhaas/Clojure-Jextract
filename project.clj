(defproject f "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :java-source-paths ["src/org"]
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :jvm-opts ["--enable-native-access=ALL-UNNAMED"]
  ;; Not needed:
  ;; :aot [org.unix]
  ;; :javac-options ["--source=25"]
  :repl-options {:init-ns f.core})
