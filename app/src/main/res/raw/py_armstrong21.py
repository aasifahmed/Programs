sum = 0
no = int(input("Enter a number: "))

temp = no
while temp > 0:
   digit = temp % 10
   sum += digit ** 3
   temp //= 10

if no == sum:
   print(no,"is an Armstrong number")
else:
   print(no,"is not an Armstrong number")