greet :: String -> String -> String -> String
greet salutation fname lname = salutation ++ ". " ++ fname ++ " " ++ lname

main :: IO ()
main = do
  print $ greet "Mr" "Dhaval" "Dalal"
  let greet_mr = greet "Mr"
  print (greet_mr "Joe" "Shmo")
  let multiplyBy2 = (* 2)
  print $ multiplyBy2 3
  print "Done!"