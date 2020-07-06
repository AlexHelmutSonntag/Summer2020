from random import randint
class Dice():
    def roll(self):
        first = randint(1,6)
        second = randint(1,6)
        return first ,second
        # This is how you return a tuple from a function
        # I could've done this and returned a tuple
        # dice_face = (randint(1,6),randint(1,6))

dice = Dice()
print (dice.roll())
 