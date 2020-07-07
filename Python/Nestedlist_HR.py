database = [[input(), float(input())] for _ in range(int(input()))]
marks_only = sorted(list(set([marks for names, marks in database])))
second_highest = marks_only[1]
print('\n'.join([a for a,b in sorted(database) if b == second_highest]))
