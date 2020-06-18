import java.util.Date;

import java.awt.*;


// This file starts from 22:54 untill 43:40
// It talks about different types in Java. Primitve and reference types
/*Basically we have two types, primitve for storing simple values.
We have (non primitive)Reference for storing complex objects

Primitive types
We have bytes and it could store from -128 to 127
short can take 2 bytes and we can store up to 32k
Int takes 4 bytes and allow us to store up to 2B
long takes 8 bytes
float takes 4 bytes
double takes 8 bytes
char takes 2 bytes
Bool takes 1 byte


Reference types (the complex objects)


*/
public class Second {

    public static void main(String[] args)
    {
        byte age =  30;
        // We could separate the number using _ just like commas in Word and we put L at the end of the number to indicate it's a long
        long viewsCount = 123_456_789_488L;
        // Java sees 10.99 as double not float and thus we put F at the end to indicate it's a float
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        System.out.println(viewsCount);//123456789488
        System.out.println(age);//30
        System.out.println(price);//10.99
        System.out.println(letter);//A
        System.out.println(isEligible); //false

        //Reference types
        // once we choose Date.util, it imports java.util.Date;
        //we use new to allocate memory for this variable
        //primitive types have no members.
        Date now = new Date();
        System.out.println(now); //Thu Jun 18 17:11:02 GMT 2020
        byte x = 1;
        byte y = x;
        System.out.println(y);//1
        y = 3;
        System.out.println(x);//1
        System.out.println(y);//3
        
        // x and y are completely two independent variables, each has their own memory location. when changing value of x, y remains unchanged.
        Point point1 = new Point(1,1);
        Point point2 = point1;
        System.out.println(point1);//java.awt.Point[x=1,y=1]
        point1.x = 2;
        System.out.println(point2);//java.awt.Point[x=2,y=1]

    }   
    
}