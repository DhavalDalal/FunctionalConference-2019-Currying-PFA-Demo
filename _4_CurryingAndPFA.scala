def merge1(x: String, y: Int) = x + y.toString
def merge2(x: String)(y: Int) = x + y.toString

// open -a iTerm
// scala

// Partially Applied Function (PFA)
def greet(salutation: String, fname: String, lname: String) = s"$salutation. $fname $lname"
println(greet("Mr", "Dhaval", "Dalal"))  // Mr Dhaval Dalal

def new_ms = greet("Ms", _: String, _: String)
println(new_ms("Ada", "Lovelace")) // Ms Ada Lovelace

def new_drew = greet(_: String, _: String, "Drew")
println(new_drew("Ms", "Nancy"))  // Ms Nancy Drew

// Re-shape Third-Party Library functions
def power(n: Double) = Math.pow(_: Double, n)
val square = power(2)
println(square(2)) // 4.0

val cube = power(3)
println(cube(2))  // 8.0

println("Done!")