
(ns app.comp.container
  (:require-macros [respo.core :refer [defcomp div span <>]])
  (:require [respo-ui.core :as ui]
            [respo.core :refer [create-comp]]
            [app.comp.sidebar :refer [comp-sidebar]]))

; container renderer
(defcomp comp-container [store]
  (div {:style ui/global}
    (comp-sidebar)
    ; insert text
    (<> span store {:font-family "Menlo, Consolas, monospace"})))
