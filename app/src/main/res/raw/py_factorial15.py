no = 8

factorial = 1

if no < 0:
   print("No factorial for negative numbers!")
elif no == 0:
   print("The factorial of 0 is 1")
else:
   for i in range(1,no + 1):
       factorial = factorial*i
   print("The factorial of",no,"is",factorial)