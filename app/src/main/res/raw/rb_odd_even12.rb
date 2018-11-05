puts('Enter a number to?');

   num=gets
   num=num.to_i
   if(num%2==0)
   then
   print num.to_s+ " is even number"+"\n"
   else
   print num.to_s+ " is odd number"+"\n"
   end