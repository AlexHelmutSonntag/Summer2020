database = []
N = int(input())
if N >1 and N <=5:
    database = [[input(), float(input())] for _ in range(N)]
    marks_only = sorted(list(set([marks for names, marks in database])))
    second_highest = marks_only[1]
    print('\n'.join([a for a,b in sorted(database) if b == second_highest]))
else : 
    print("Number must be between 2 and 5")
