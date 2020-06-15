# This file is from 2:13:34 till 2:30:40

# This file is about Tuples and Dictionaries.
# Tuples are immutable; we cannot change or mutate them.


numbers = [1,2,3]
tuple1 = (1,2,3)

print(tuple1.count(2)) #1

print(tuple1[1])#2

# tuple1[0] = 2  #gives an error'Tuple object does not support item assignment

# Unpacking

coordinates = (1,2,3)
# To use the values of the tuples we could assign variables to the values or we could unpack
# x = coordinates[0] 
# y = coordinates[1] 
# z = coordinates[2] 

x, y, z = coordinates


print(x)#1
print(y)#2
print(z)#3


# Dictionaries

customer = {
    "name": "John Smith" , 
    "age" : 30,
    "is_verified": True
           }


print(customer["name"]) #John Smith
print(customer.get("is_verified"))#True #We would use the get method because if we use a "key" that doesn't exist we don't get an error but we get "None"

# We could also add value using get method


print(customer.get("Birth_Date", "Nov 6 1986"))#Nov 6 1986
print(customer.get("Birth_Date"))#Gives us None beause it doesn't update the dictionary, it just adds it temporarily
customer["name"] ="Jack Smith"
#keys could also be updated
print(customer.get("name"))
customer["Birth_Date"] = "Oct 9 2018" #This is how to update the dicitonary and add a key with a value
print(customer.get("Birth_Date"))


# string = input("Phone: ")

digits_mapping = {
    "1" : "One",
    "2" : "Two",
    "3" : "Three",
    "4" : "Four",
    "5" : "Five",
    "6" : "Six",
    "7" : "Seven",
    "8" : "Eight",
    "9" : "Nine",
    "0" : "Zero"
}

output=""
for ch in string:
    output+= digits_mapping.get(ch,"!") + " "
print(output)


# Emoji Converter

emojis = {
    ":)" : "😊",
    ":(" : "☹",
    ":*" : "😘"

}

message = input(">")
words = message.split(' ')

output = ""
for word in words:
    output += emojis.get(word,word) + " "
print(output)