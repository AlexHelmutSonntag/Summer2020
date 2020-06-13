#This file is from 29:44 till 48:41 
#This file is about Strings

# If you want to use double quotes then define the string with '. You could use "" if it's the other way around
course = 'Python course for "Beginners"'
print(course)
# You could use three quotes to write a long multiple-lined string
Email = '''
Hey John,

Here is our first email to you.

Thank you,
The support team
'''
print(Email)

# If you wanna access specific characters in the string use indexing

print(course[0]) # P
print(course[len(course)-1]) # this prints " which is the last element in the array.
# In Python we could use negative indexing. e.g: if we use index -1 it gets us the last element in the array
print(course[-1])#"

# You could also get a set of characters in a string using  :
# it prints all the charactes from the interval till the end except the end number index

print(course[0:6]) # Python
print(course[7:]) #course for "Beginners"

# That means we could copy strings so easy.

full_name = 'Ali Magdi'
last_name = full_name[4:] 
print(last_name) #Magdi

jennifer = 'Jennifer'
print(jennifer[1:-1]) # ennife
#It prints all the characters from the second index till the last one, excluding the last one.

###################################
#Formatted Strings


first = 'John'
last = 'Smith'
message = first + ' [' + last + '] is a coder'
print(message)
# The f'' means formatted String
#the {} are used to dynamically insert values into the strings
msg = f'{first} [{last}] is a coder' 
#Prints the same thing but this one is much more practical
print(msg)

#Strings methods

string = 'Python for Beginners'
print(len(string)) #20
# the functions that are specific to an object are called methods.
print(string.upper()) #PYTHON FOR BEGINNERS
#This method doesn't change the string, but it passes in a copy as a parameter and then operates on it, so that the original variable is left untouched.
print(string.lower())
print(string)
# The find method returns the index of the searched value and -1 if the searched value is not found in the string 
# It also returns the first appearance of the searched value
print(string.find('B')) 
# These Methods are case sensetive which means if it doesn't find the searched string, it won't do the operation and then will print the original string.
print(string.replace('Beginners','Absolute Beginners'))#Python for Absolute Beginners
print(string.replace('P','J'))#Jython for Beginners
print('Python' in string) # True
flag = 'Python' in string
print(flag)  # True'
