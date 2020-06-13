#This file is from 1:20:50 1:31:00

#While loops

i = 1

while i<=5:
    print('*' * i)
    i+=1


guess_cnt = 0
secret_value = 9
guess_limit = 3
flag = bool(False)
while guess_cnt<guess_limit:
    guess =int( input("Guess a number from 1 to 9: "))
    guess_cnt+=1
    if guess == secret_value:
        flag = True
        print("You Won!")
        # guess_cnt +=guess_limit
        break
else:
    print("Sorry, you failed!")
# if not flag:
#     print("You Lost!")
# While loops also have an else statement whose block is only executed if the while loop ends without having a break within the while loop executed. This is the same idea of using flags but I personally think it is better to be able to control the variable yourself.

