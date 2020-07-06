#https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/problem?h_r=next-challenge&h_v=zen

n = int(input())
arr = []
for i in range(0,n):
    temp = input()
    arr.append(temp)
arr.sort()
print(arr[arr.index(max(arr))-1])
