selecciona :: String -> (Double -> Double -> Double)
selecciona "-" = \x y -> x - y
selecciona "/" = \x y -> x / y
selecciona "*" = \x y -> x * y
selecciona x =   \x y -> x + y

opera :: Double -> Double -> String -> Double
opera a b op = (selecciona op) a b

main = do
  putStrLn ("Inserta el valor de a:")
  a <- getLine
  putStrLn ("Inserta el valor de b:")
  b <- getLine
  putStrLn ("Inserta la función (+ - * /):")
  op <- getLine

  print(opera
          (fst(head(reads a :: [(Double, String)])))
          (fst(head(reads b :: [(Double, String)])))
          op)
  putStrLn ("ok")
