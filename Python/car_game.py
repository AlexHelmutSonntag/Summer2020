#This file stops at 1:41:55
command=""
started = False
while True:
    command = input(">").lower()
    if command == "help":
        print("""
start - to start the car
stop - to stop the car
quit - to quit""")
    elif command == "start":
        if started:
            print("Car already started dumdum!")
        else:
            started = True
            print("Car started..Ready to go!")
    elif command == "stop":
        if not started:
            print("Car already stopped dumdum!")
        else:
            started = False
            print("Car Stopped.")
    elif command == "quit":
        break
    else:
        print("I don't understand that..")
        
print("Quitting game..")


