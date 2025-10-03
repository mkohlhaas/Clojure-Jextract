(ns f.core
  (:import
   [java.lang.foreign Arena]
   [org.unix time_h tm]))

(let [arena (Arena/ofConfined)
      now   (.allocateFrom arena time_h/C_LONG (long (/ (System/currentTimeMillis) 1000)))
      time  (tm/allocate arena)]
  (time_h/localtime_r now time)
  (print (tm/tm_hour time) (tm/tm_min time)))
