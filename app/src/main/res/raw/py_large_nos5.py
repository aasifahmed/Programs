no1 = 23
no2 = 19
no3 = 37

if (no1 >= no2) and (no1 >= no3):
   largest = no1
elif (no2 >= no1) and (no2 >= no3):
   largest = no2
else:
   largest = no3

print("The largest number among",no1,no2,"and",no3,"is",largest)