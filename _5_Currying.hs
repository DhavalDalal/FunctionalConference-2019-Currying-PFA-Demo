greet :: String -> String -> String -> String
greet salutation fname lname = salutation ++ ". " ++ fname ++ " " ++ lname

main :: IO ()
main = do
  print $ greet "Mr" "Dhaval" "Dalal"   -- Mr Dhaval Dalal
  let greet_mr = greet "Mr"
  print (greet_mr "Joe" "Shmo")  -- Mr Joe Shmo
  let greet_mr_joe = greet "Mr" "Joe"
  print (greet_mr_joe "Sober")   -- Mr Joe Sober
  let even = \x -> x `mod` 2 == 0
  let filterEvens = filter even
  let filterOdds = filter (not . even)
  print $ filterEvens [0..10]
  print $ filterOdds [0..10]
  print "Done!"