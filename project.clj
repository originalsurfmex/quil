(defproject quil-processing2 "1.0.0"
  :description "(mix Processing 2 Clojure)"
  :url "http://github.com/quil/quil"
  :mailing-list {:name "Quil Mailing List"
                 :archive "https://groups.google.com/forum/?fromgroups#!forum/clj-processing"
                 :post "clj-processing@googlegroups.com"}
  :license {:name "Common Public License - v 1.0"
            :url "http://www.opensource.org/licenses/cpl1.0"}

    :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojars.originalsurfmex.processing/core "2.1"]
                 [org.clojars.originalsurfmex.processing/jogl-all "2.1"]
                 [org.clojars.originalsurfmex.processing/jogl-all-natives-linux-amd64 "2.1"]
                 [org.clojars.originalsurfmex.processing/jogl-all-natives-linux-i586 "2.1"]
                 [org.clojars.originalsurfmex.processing/jogl-all-natives-linux-armv6hf "2.1"]
                 [org.clojars.originalsurfmex.processing/jogl-all-natives-macosx-universal "2.1"]
                 [org.clojars.originalsurfmex.processing/jogl-all-natives-windows-amd64 "2.1"]
                 [org.clojars.originalsurfmex.processing/jogl-all-natives-windows-i586 "2.1"]
                 [org.clojars.originalsurfmex.processing/gluegen-rt "2.1"]
                 [org.clojars.originalsurfmex.processing/gluegen-rt-natives-linux-amd64 "2.1"]
                 [org.clojars.originalsurfmex.processing/gluegen-rt-natives-linux-i586 "2.1"]
                 [org.clojars.originalsurfmex.processing/gluegen-rt-natives-linux-armv6hf "2.1"]
                 [org.clojars.originalsurfmex.processing/gluegen-rt-natives-macosx-universal "2.1"]
                 [org.clojars.originalsurfmex.processing/gluegen-rt-natives-windows-amd64 "2.1"]
                 [org.clojars.originalsurfmex.processing/gluegen-rt-natives-windows-i586 "2.1"] ]

  :aot [quil.applet])

;; YOU CAN ALSO USE GITHUB AS A REPO
;;  :repositories [["processinglibs" "https://github.com/originalsurfmex/originalsurfmex_m2/tree/master/repository/"]]
;;    :dependencies [[org.clojure/clojure "1.5.1"]
;;                 [processing/core "2.1"]
;;                 [processing/jogl-all "2.1"]
;;                 [processing/jogl-all-natives-linux-amd64 "2.1"]
;;                 [processing/jogl-all-natives-linux-i586 "2.1"]
;;                 [processing/jogl-all-natives-linux-armv6hf "2.1"]
;;                 [processing/jogl-all-natives-macosx-universal "2.1"]
;;                 [processing/jogl-all-natives-windows-amd64 "2.1"]
;;                 [processing/jogl-all-natives-windows-i586 "2.1"]
;;                 [processing/gluegen-rt "2.1"]
;;                 [processing/gluegen-rt-natives-linux-amd64 "2.1"]
;;                 [processing/gluegen-rt-natives-linux-i586 "2.1"]
;;                 [processing/gluegen-rt-natives-linux-armv6hf "2.1"]
;;                 [processing/gluegen-rt-natives-macosx-universal "2.1"]
;;                 [processing/gluegen-rt-natives-windows-amd64 "2.1"]
;;                 [processing/gluegen-rt-natives-windows-i586 "2.1"] ]
