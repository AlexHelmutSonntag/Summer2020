#This file is from 48:41 till 58:21
#This file is about Arithmetics and mathematical functions
import math
print(10+3) #13
print(10/3) #3.3333333333333335 #Gets the value in float
print(10//3) #3  #Gets the value in int
print(10%3)  #1
print(10**3) #1000 #The ** sign means exponent


#Augmented assignment operator
x = 10
x += 3
print(x)#13
x -= 3
print(x)#10

#Operator precedence
#same as the mathematics concept

'''
1- Exponentiation 2**3
2- Multiplication or division
3- Addition or subtraction
'''
# There are also some built-in functions for mathematical operations
y = 2.9
print(round(y))#3

print(abs(-y))#2.9

#We could import modules in order to reuse the code in different files

# for example we use import math in order to import the file which contains all of the math functions. we write it at the top. Check line 1
#after importing it we could use math as an object and access it's methods using the dot operator


print(math.ceil(2.9))#3 this is basically getting the ceiling(just like rounding) of a number

# for more math functions please check : https://docs.python.org/3/library/math.html
