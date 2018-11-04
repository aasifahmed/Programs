no = 306

if no > 1:

   for i in range(2,no):
       if (no % i) == 0:
           print(no,"is not a prime number")
           print(i,"times",no//i,"is",no)
           break
   else:
       print(no,"is a prime number")

else:
   print(no,"is not a prime number")