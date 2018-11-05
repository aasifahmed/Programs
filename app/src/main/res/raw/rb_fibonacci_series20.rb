def fibonacci(n)
    a = 0
    b = 1

    n.times do
        temp = a
        a = b
        b = temp + b
    end

    return a
end
puts "Enter number length?"
num = gets
num = num.to_i
num.times do |n|
    result = fibonacci(n)
    puts result
end