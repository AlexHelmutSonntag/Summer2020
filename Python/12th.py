# This file starts from 3:20:04 till 3:25:28
# This files is a based on 11th.py
# This file is about modules
#We could either import the whole module or we could import specific functions from that module

import converters
your_Weight = converters.lbs_to_kg(175)
print(your_Weight)#78.75


from converters import lbs_to_kg 
from converters import kg_to_lbs
my_Weight = lbs_to_kg(180)
print(my_Weight)#81.0
print(kg_to_lbs(my_Weight))#180.0