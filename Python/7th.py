# This file starts from 1:56:00 till 2:13:34

# This file is about lists (1D and 2D)

names = ['John', 'Bob', 'Mosh' , 'Sarah', 'Mary']

#Basically lists are arrays and you access the members using the index and you modify the elements by redeclarations
print(names[0])#John
print('##')
print(names[-2]) #Sarah
print('##')
print(names[2:]) #['Mosh', 'Sarah', 'Mary'] 
print('##')
print(names[2:4]) #['Mosh', 'Sarah']
print('##')
print(names)
print('##')
names[0] = 'Jon'
print(names)

# Find the largest number in a list

numbers = [1,9,2,3,4,5,8,3,15,10,1]

maximum = numbers[0]
for item in numbers:
    if item > maximum:
        maximum = item

print(f"maximum is : {maximum}")
print('##')


#2D lists

matrix = [[1,2,3],[4,5,6],[7,8,9]]

print(matrix[0][0]) #1
print(matrix[2][0]) #7
print(matrix[2][2]) #9
print('##')

for row in matrix:
    display = ''
    for column in row:
        display += str(column)
    print(f"|{display}|")

print('##')

############

#List methods

nums = [5,2,5,7,4]
print(nums)
print('##')

nums.append(20)
print(nums)
print('##')

nums.insert((len(nums))//2,20)#inserts an element and the 1st paramter is the index to be used
print(nums)
print('##')

#the remove method removes the first appearance of the passed value
nums.remove(5)
print(nums)
print('##')

nums.pop() #removes the last element in the list
print(nums)
print('##')

print(nums.index(20))#2 # gets the index of the passed value
print('##')


print(nums.count(20))#1 #this counts the occurence of the passed value in the list
print('##')

print(50 in nums)#False
print('##')

nums.sort()#sorts the list ascendingly 
print(nums)

print('##')
nums.reverse()# reverses the order of the list
print(nums)
print('##')
nums2 = nums.copy()
nums.clear()#clears the whole list
print(nums)
print('##')



nums.append(10)

print(nums)
print('##')
print(nums2)
print('##')


liste = [1,1,2,3,4,5,5,6,7,7,8,9,9,10]
# Removing duplicates in a list
print(liste)
for x in liste:
    if liste.count(x)>=2:
        liste.remove(x)

print(liste)
# Another way without touching the original list
uniques = []
for number in liste:
    if number not in uniques:
        uniques.append(number)
print(uniques)



