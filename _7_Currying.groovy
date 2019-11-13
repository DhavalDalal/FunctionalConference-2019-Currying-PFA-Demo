def merge = { x, y, z ->
  "$x$y$z"
}

println merge.curry('Hello', 45.6)(10)
println merge.rcurry('Hello', 45.6)(10)
println merge.ncurry(1, 'Hello', 45.6)(20)
