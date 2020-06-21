import java.util.Scanner;

// This file is from 2:06:07 
// It's about loops
public class Ninth {
    public static void main(String[] args) {
        // For loops
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World " + i);
        }
        System.out.println("##");
        // For-each loops
        String[] fruits = { "Apple", "Mango", "Orange" };

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println("##");
        
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("##");

        // While loops
        int i = 0;
        while (i < 5) {
            System.out.println("Hello World " + i);
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
        // Do While loops
        // do {
        // System.out.print("Input: ");
        // input = scanner.next().toLowerCase();
        // }while(!input.equals("quit"));
        // Break and Continue

    }
}