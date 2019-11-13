(defn new-person [salutation f-name l-name]
  (println salutation f-name l-name))

(new-person "Mr." "Dhaval" "Dalal")

(def new-ms (partial new-person "Ms"))

(new-ms "Ada" "Lovelace")

(def new-dalal #(new-person %1 %2 "Dalal"))

(new-dalal "Ms." "Tesla")
(new-dalal "Mrs." "Prutha")