import Data.List

array = [52, 20, 18, 88, 59, 77, 13, 58, 41, 71]
main = do
  print (array)
  print (sortBy(\x y -> if x > y then GT else LT) array)
  print (sortBy(\x y -> if y > x then GT else LT) array)
