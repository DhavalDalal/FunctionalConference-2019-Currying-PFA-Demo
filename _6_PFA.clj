(defn new-person [salutation f-name l-name]
  (println salutation f-name l-name))

(new-person "Mr." "Dhaval" "Dalal")

(def new-ms (partial new-person "Ms"))

(new-ms "Ada" "Lovelace")

(def new-ms-ada (partial new-person "Ms" "Ada"))
(new-ms-ada "LOVELACE")

(def new-shah (fn [sal fname]
    (new-person sal fname "Shah")))
    
(new-shah "Mr." "Mahendra")    

(def new-ada #(new-person %1 "Ada" %2))

(new-ada "Ms." "Lovelace")
(new-ada "Mrs." "??")

; (def filter-odds (partial filter odd?))
(def filter-odds #(filter odd? %1))
(println (filter-odds (range 10)))

; (def filter-evens (partial filter even?))
(def filter-evens #(filter even? %1))
(println (filter-evens (range 10)))
