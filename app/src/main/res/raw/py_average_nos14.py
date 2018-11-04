print("Enter 'x' for exit.");
print("Enter any 5 numbers to find average: ");
n1 = input();
if n1 == 'x':
    exit();
else:
    n2 = input();
    n3 = input();
    n4 = input();
    n5 = input();
    number1 = int(n1);
    number2 = int(n2);
    number3 = int(n3);
    number4 = int(n4);
    number5 = int(n5);
    sum = number1 + number2 + number3 + number4 + number5;
    average = sum/5;
    print("Average of entered 5 numbers is",average);