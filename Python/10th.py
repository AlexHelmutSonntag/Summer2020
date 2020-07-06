# This file is from 2:54:00 till 3:02:00
# This files is about Exceptions
# It's about handling errors in Python programs

# We are telling the compiler, try this code block and if you face any errors, execute this code block after except
# We refer to this as an exception, which is an error that crashes the program
# so Try will throw the error and except will catch it just like in Java
try:
    age = int (input('Age: '))
    income = 20000
    risk = income/age    
    print(age)
except ZeroDivisionError :
    print("Age cannot be 0")
except ValueError :
    print("Invalid Value")


# Comments in Python
