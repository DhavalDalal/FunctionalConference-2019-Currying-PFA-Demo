def filterList = { filter, list -> list.findAll(filter) }
def even = { it % 2 == 0 }
def evens = filterList.curry(even)
println evens(0..10) // [0, 2, 4, 6, 8, 10]

def not = { !it }
def odds = filterList.curry(even >> not)  // even andThen not
println odds(0..10) // [1, 3, 5, 7, 9]

def merge = { x, y, z ->
  println "arg0: x = $x"
  println "arg1: y = $y"
  println "arg2: z = $z"
  "$x$y$z"
}

println merge.curry(10)('Hello', new Date()) // 10Hello<Date>
println merge.curry(10, 'Hello')(new Date()) // 10Hello<Date>

println merge.rcurry(10)('Hello', new Date()) // Hello<Date>10
println merge.rcurry(10, 'Hello')(new Date()) // <Date>10Hello
println merge.ncurry(1, new Date())(10, 'Hello')  //10<Date>Hello
println merge.ncurry(0, new Date(), 'Hello')(10) //<Date>Hello10