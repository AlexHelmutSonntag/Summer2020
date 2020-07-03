# This file starts from 2:30:40 till 2:49:00
# This file talks about Functions and parameters and arguments
# You should always first_name your functions using lower case letters. and use meaningful names
# Order matters in calling functions
def greet_user(first_name, last_name):
    print(f'Hey {first_name} {last_name}!')
    print('Welcome aboard')


print("Start")
Vorname = input("Input first name please: ")
Nachname = input("Input last name please: ")

greet_user(Vorname, Nachname)
greet_user("Mary","Elisabeth")
print("Finish")
print("#")

# This is called key word arguments like hard coding the value of the arguments
greet_user(last_name="Smith", first_name="John")

# Positional argument always comes before key word argument

print("#")
greet_user("John", last_name="Smith")

# Using key word arguments it can improve the readability of the code by using key word arguments
# calc_cost(Total = 50,Shipping =  5,Discount = 0.1)
print("#")
def square(number):
    return number * number
# If you don't have a return statement it returns None on Output Stream
print(square(3))
