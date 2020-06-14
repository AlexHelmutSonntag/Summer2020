#This File starts from 1:42:00 till 1:56:00

#This File is about for loops and how to nest them


# for loops


for item in 'Python':
    print(item.upper())

print('##')


for item in ['Mosh','John','Sarah']:
    print(item)

print('##')


for item in range(10):
    print(item)

#When we call the range function, it creates an object that we can iterate over
print('##')


# range(start_of_range,end_of_range,step_of_range)
for item in range(5,10,2):
    print(item)

print('##')


prices = [10,20,30]

total = 0

for price in prices:
    total +=  price
print(f"total = {total}")

print('##')

#Nested Loops


for x in range(3):
    for y in range(3):
        print(f"({x},{y})")

print('##')

numbers = [5,2,5,2,2]

for item in numbers:
    print('x'*item)

print('##')
for x in numbers:
    output =''
    for y in range(x) :
        output+='x'
    print(output)    