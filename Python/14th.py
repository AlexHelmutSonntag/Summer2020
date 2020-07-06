# This file starts from 3:44:57 till 3:51:02
# This file is about files and directories
from pathlib import Path

# Absolute path : we start from the route of our hard disk
# c:\Program Files\ Microsoft
# Relative path : we start from our current directory and then go somewhere else

path = Path("ecommerce")
path = Path("Expl0it")#this means we are choosing the directory with the name Expl0it in our current directory and with mkdir it creates it if doesn't exist
try :
    path.mkdir()

except FileExistsError:
    print("File already exists")

if (path.exists()):
    path.rmdir()

print(path.exists())#This checks if this directory exists and prints a boolean on the screen

path = Path()#This means the file path is in the current directory
# With the glob method we can search for files and directories in the current path  
# By passing '*' as first parameter it means search all files and all directories 
# With '*.*' we will get only the files in the directory but not the directories
# For example '*.py' means we search for all the py files in the current directory  
for file in path.glob('*.py'):
    print(file)
path = Path("/mnt/f/Summer2020/Java")
for file in path.glob('*'):
    print(file)

