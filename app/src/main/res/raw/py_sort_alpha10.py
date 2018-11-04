my_str = "Hello This Sentence Has Words In Random Alphabetical Order"

words = my_str.split()

words.sort()

print("The sorted words are:")
for word in words:
   print(word)