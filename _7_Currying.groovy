def filterList = { filter, list -> list.findAll(filter) }

def even = { it % 2 == 0 }

def odd = { !even(it) } 

def evens = filterList.curry(even)
def odds = filterList.curry(odd)
println evens(0..10)
println odds(0..10)

def merge = { x, y, z ->
  println "0 => x = $x"
  println "1 => y = $y"
  println "2 => z = $z"
  "$x$y$z"
}

println merge.curry(10)('Hello', new Date())
println merge.rcurry(10)('Hello', new Date())
println merge.ncurry(0, new Date(), ':OK:')('Hello')
println merge.ncurry(1, new Date(), 0, 10)('Hello')