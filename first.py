# This file is from 00:00  till 29:44
#This file is more about an introduction

# name = input('what is your name? ')
# print('Hi ' + name) 

# The compiler deals with all variables as string by default and you have to convert it by using the built in functions
birth_year = input('Birth year: ')
print(type(birth_year))
# we have a function to get the type of the variable. it's called type
age = 2020 - int(birth_year)
print(type(age))
print(age)

# Converts weight in lbs to weight in kgs
weight_lbs = input('Please enter your weight in # : ')
weight_kgs = (float(weight_lbs) / 2.205)

print('your weight in kgs : '+ str(weight_kgs))


