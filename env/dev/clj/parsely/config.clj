(ns parsely.config
  (:require [selmer.parser :as parser]
            [taoensso.timbre :as timbre]
            [parsely.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (timbre/info "\n-=[parsely started successfully using the development profile]=-"))
   :middleware wrap-dev})
