greet :: String -> String -> String -> String
greet salutation fname lname = salutation ++ ". " ++ fname ++ " " ++ lname

main :: IO ()
main = do
  print $ greet "Mr" "Dhaval" "Dalal"
  let greet_mr = greet "Mr"
  print (greet_mr "Joe" "Shmo")
  let greet_mr_joe = greet "Mr" "Joe"
  print (greet_mr_joe "Dangi")
  let even = \x -> x `mod` 2 == 0
  let odd = not . even
  let filterEvens = filter even
  let filterOdds = filter odd
  print $ filterEvens [0..10]
  print $ filterOdds [0..10]
  print "Done!"