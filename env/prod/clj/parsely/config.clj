(ns parsely.config
  (:require [taoensso.timbre :as timbre]))

(def defaults
  {:init
   (fn []
     (timbre/info "\n-=[parsely started successfully]=-"))
   :middleware identity})
