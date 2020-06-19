// This file is from 1:01:55 till 1:15:20
//it talks about Arithmetics in java
public class Fifth {
    public static void main(String[] args) {
        // Constants
        final float PI = 3.14F;
        double result = (double) 10 / (double) 3;
        int answer = 10 / 3;
        System.out.println(answer);// 3
        System.out.println(result);// 3.3333333333333335
        answer += 1;
        System.out.println(answer);// 4
        // Order of operations
        /*
         * 1-parantheses () 2-Exponents 3-(Multiply/Divison) 4-(Addition/Subtraction)
         */
        // Casting
        short x = 1;
        // Implicit casting : Automatic casting
        // byte > short>int>long
        int y = x + 2;
        System.out.println(y);
        // byte > short > int > long > float > double
        double x1 = 1.1;
        double y1 = x1 + 2;
        System.out.println(y1);// 3.1
        // Explicit casting : manual casting
        int y2 = (int) x1 + 2;
        System.out.println(y2);// 3
        // We can't cast a string to an int because they are not compatible
        // In Java we wrapper classes defined in java.lang

        // this method takes a string and returns integer and integer here is a wrapper
        // class for the int primitive type
        String two = "2";
        int y3 = Integer.parseInt(two) + 2;
        System.out.println(y3);

    }
}