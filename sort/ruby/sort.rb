array = Array.new()
i = 0
while i < 10 do
  array.push(rand(1...100))
  i += 1
end

puts array.inspect

normal_sorter = lambda{|x,y|
  if x < y
    return -1
  elsif x == y
    return 0
  else
    return 1
  end
  }
#puts array.sort{|x,y| x <=> y}.inspect
puts array.sort(&normal_sorter).inspect
puts array.sort{|x,y| y <=> x}.inspect
