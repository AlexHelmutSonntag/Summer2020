import java.util.Scanner;

public class StdinStdout2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //there's a method called use delimiter when reading from std in. Just keep that in mind.
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();// this cleans the buffer because /*After supplying data for int, we would hit the enter key. What nextInt() and nextDouble() does is it assigns integer to appropriate variable and keeps the enter key unread in thekeyboard buffer. so when its time to supply String the nextLine() will read the enter key from the user thinking that the user has entered the enter key.(that's we get empty output) . Unlike C, there is no fflush() to clean buffer, so we have to flush by not taking it in variable.*/
        String s = scanner.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scanner.close();
    }

}