import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);
        byte number = scanner.nextByte();

        String result = Byte.toString(number);
        boolean notZero = number != 0;
        if (number % 5 == 0 && number % 3 == 0 && notZero) {
            result = "FizzBuzz";
        } else if (number % 3 == 0 && notZero) {
            result = "Buzz";
        } else if (number % 5 == 0 && notZero) {
            result = "Fizz";
        }
        System.out.println(result);
        scanner.close();
    }

}