def selecciona(op)
  case op
  when "-"
    return lambda{|x,y| x - y}
  when "/"
    return lambda{|x,y| x / y}
  when "*"
    return lambda{|x,y| x * y}
  else
    return lambda{|x,y| x + y}
  end
end

puts "Inserta el valor de a: "
a = gets.to_f

puts "Inserta el valor de b: "
b = gets.to_f

puts "Inserta la función (+ - * /): "
op = gets.chomp

puts selecciona(op).call(a, b)
