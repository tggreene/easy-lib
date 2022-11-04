(ns clj.new.easy-lib
  (:require [clj.new.templates :refer [renderer project-data ->files]]
            [clojure.string :as str]))

(defn good-project-data
  [name]
  (let [{:keys [name scm-domain group] :as data} (project-data name)
        scm-reversed (->> (str/split scm-domain #"\.")
                          (reverse)
                          (str/join "."))]
    (assoc data
           :scm-reversed scm-reversed
           :scm-group (str scm-reversed "." group)
           :scm-url (str "https://" scm-domain "/" group "/" name))))

(defn easy-lib
  [name]
  (let [render (renderer "easy-lib")
        {:keys [name] :as data} (good-project-data name)]
    (println (str "Generating new easy-lib project in '" name "'..."))
    (->files data
             ["deps.edn" (render "deps.edn" data)]
             ["release.edn" (render "release.edn" data)]
             ["justfile" (render "justfile" data)]
             [".gitignore" (render ".gitignore" data)]
             ["LICENSE" (render "LICENSE" data)]
             ["src/{{nested-dirs}}.clj" (render "foo.clj" data)])))
