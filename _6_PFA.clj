(defn new-person [salutation f-name l-name]
  (println salutation f-name l-name))

(new-person "Mr." "Dhaval" "Dalal") ; Mr Dhaval Dalal

(def new-ms (partial new-person "Ms"))

(new-ms "Ada" "Lovelace") ; Ms Ada Lovelace

(def new-ms-ada (partial new-person "Ms" "Ada"))
(new-ms-ada "Lovelace") ; Ms Ada Lovelace

; What if we want to fix the third arg - last name instead of the 1st? 
; The below does not compile.
; (def new-dalal (partial new-person salutation f-name "Dalal"))
; (new-dalal "Mr" "Dhaval")

(def new-dalal (fn [sal fname]
    (new-person sal fname "Dalal")))
    
(new-dalal "Mr." "Dhaval") ; Mr. Dhaval Dalal

(def new-dalal2 #(new-person %1 %2 "Dalal")) ; Mr. Dhaval Dalal
(new-dalal2 "Mr." "Dhaval") ; Mr. Dhaval Dalal

(def new-ada #(new-person %1 "Ada" %2))
(new-ada "Ms." "Lovelace") ; Ms Ada Lovelace
(new-ada "Mrs." "???") ; Mrs. Ada ???

; (def filter-odds (partial filter odd?))
(def filter-odds #(filter odd? %1))
(println (filter-odds (range 10)))

; (def filter-evens (partial filter even?))
(def filter-evens #(filter even? %1))
(println (filter-evens (range 10)))

