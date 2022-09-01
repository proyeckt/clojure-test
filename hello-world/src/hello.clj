(ns hello
    (:require [hello-time :as ht]))

(defn run [opts]
      (println "Hello world, the time is" (ht/time-str (ht/now))))

(ns hello)
  (defn run [opts]
         (future (Thread/sleep 4000)
                 (println "I'll print after 4 seconds"))
         (println "I'll print immediately")
    )