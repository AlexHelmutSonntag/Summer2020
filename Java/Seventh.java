import java.util.Scanner;

// This file is from 1:25:40 till 1:30:45
// The Mortgage_calc is until 1:37:12

// This file is about reading input
public class Seventh {
    public static void main(String[] args) {
        System.out.print("Age: ");
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.println("You are " + age);
        System.out.print("Name: ");
        scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim(); //We use .nextline because it keeps on reading the String till it meats the \n in the String not the \0
        //We also used trim to avoid user inputting a lot of spaces and ruining their input
        System.out.println("You are " + name);

    }

}