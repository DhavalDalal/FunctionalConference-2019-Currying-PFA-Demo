def merge1(x: String, y: Int) = x + y.toString
def merge2(x: String)(y: Int) = x + y.toString

// open -a iTerm
// scala

// Partially Applied Function (PFA)
def greet(salutation: String, fname: String, lname: String) = s"$salutation. $fname $lname"
println(greet("Mr", "Dhaval", "Dalal"))

def new_ms = greet("Ms", _: String, _: String)
println(new_ms("Sharvari", "Dalal"))

def new_dalal = greet(_: String, _: String, "Dalal")
println(new_dalal("Mrs", "Prutha"))


println("Done!")
