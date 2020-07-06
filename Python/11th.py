# This file starts from 3:02:02 till 3:20:04
# This file is about Classes and objects(instances) and their syntax in Python
# This file is about Constructors
class Point:
    def __init__(self,x,y):
        # This self that you see here is a reference to the current object
        self.x = x
        self.y = y


    def move(self):
        print("move")
    

    def draw(self):
        print("draw")
    
# 60 and 50 are passed in only to make this work but you could still use attributes without making constructors for them in the class although it's recommended to do that.
point1 = Point(50,60)
point1.x = 10
point1.y = 20
point1.draw()
print(point1.x)#10
# Same here for 80 and 90
point2 = Point(80,90)
# print(point2.x)#gives you error because Point doesn't have an attribute x 
point2.x = 69 
print(point2.x)#69

# Constructors
# It's a function that gets called at time of creating the object

# print(point.x)#Attribute error
# But after setting the constructor, it works because now we've initialized our objects
point = Point(10,20)
print(point.x)#10


# Inheritance in Python
class Mammal:
    def walk(self):
        print("Walk")

class Dog(Mammal) :
    def bark(self):
        print("Bark")
# Pass means nothing but we are just making the compiler happy by avoiding red underlines

class Cat(Mammal):
    def meow(self):
        print("MEOOOOW")
# by using Mammal inside class Cat, we inherited it's content 

    


dog1 = Dog()
dog1.walk()#Walk
dog1.bark()#"Bark"
cat1 = Cat()
cat1.walk()#Walk
cat1.meow()#MEOOOOW



