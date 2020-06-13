weight = float(input("Weight: "))
unit = input("(L)bs or (K)g: ")

if unit.upper() == "L":
    result =(weight / 2.205)
    
    print(f"Your weight is {round(result,2)} Kilos")
elif unit.upper() == "K":
    result =float( weight * 2.205)
    print(f"Your weight is {round(result,2)} Pounds")
else:
    print("Invalid Input")
