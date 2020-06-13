#This file is from 58:21 till 1:20:50

#If statements

is_hot = True
is_cold = False
if is_hot:
    print("It's a damn hot day")
    print("Drink Plenty of water!")
elif is_cold:
    print("It's a cold day")
    print("Wear warm clothes")
else:
    print("It's a lovely day")
print("Enjoy your day")


has_good_credit = True
Price = float(1000000)
if has_good_credit:
    down_payment = Price*0.1
else:
    down_payment = Price*0.2

print(f"Down payment : ${down_payment}")

print("#")

#Logical Operators

has_high_income = False

if has_high_income and has_good_credit :
    print("Eligible for loan")
else:
    if has_high_income or has_good_credit:
        print("Eligible for loan under signature")
    else:
        print("Not Eligible under any circumstances") 
print("#")
has_criminal_record = False
if has_good_credit and not has_criminal_record:
    print("Applicant elligible for loan")
print("#")


#Comparison operators

temperature = 30
if temperature == 30:
    print("It's a hot day")
else:
    print("It's not a hot day")
    
print("#")

name = input("Please Enter your name : ")

if len(name) < 3:
    print("Name must be at least 3 characters long")
elif len(name)> 50:
    print("Name can not be longer than 50")
else:
    print("This name looks good")

