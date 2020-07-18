name_Dict = {'Alexis':'Ethical Hacker','Elliot':'Master Mind','Ethan':'Spy'}

# print(name_Dict['Alexis']) #Ethical Hacker
# print(name_Dict['Elliot']) #Maste Mind


for k, v in name_Dict.items():
    print(k +" "+ v)

print(name_Dict.items())#[('Elliot', 'Master Mind'), ('Alexis', 'Ethical Hacker'), ('Ethan', 'Spy')]

tuples1 = [(1,2),(3,4),(5,6)]

for fst, snd in tuples1:
    print(f"({fst},{snd})")
