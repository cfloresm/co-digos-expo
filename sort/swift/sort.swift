import Foundation

var array = [Int]()

var i = 0
while i < 10 {
    array.append(Int(arc4random_uniform(100)))
    i += 1
}

print(array)

array = array.sort { (x: Int, y: Int) -> Bool in
    if x < y {
        return true
    } else {
        return false
    }
}
print(array)

array = array.sort(>)
print(array)
