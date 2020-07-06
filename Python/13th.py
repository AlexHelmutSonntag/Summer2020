# This file starts from 3:30:29 till 3:44:57
# This file is about packages
# A package is a container for multiple modules to organize modules

# Check directory ecommerce in this directory /mnt/f/Summer2020/Python
# You'll find there shipping.py
import ecommerce.shipping
# this means we have imported module shipping from the package ecommerce
ecommerce.shipping.calc_shipping()#calc_shipping
print("#")

# Another approach
from ecommerce.shipping import calc_shipping, calc_tax

calc_shipping()
calc_tax()
print("#")

# Another approach
from ecommerce import shipping

shipping.calc_shipping()
shipping.calc_tax()

# Now for the built-in modules
import random
# random gets a random number between 0 and 1 
# randint takes two parameters and generates random number between them both
for i in range(3):
    print(random.randint(10,20))

team_members = ['John','Mary','Bob','Mosh']

leader = random.choice(team_members)
print(leader)