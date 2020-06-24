import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        String s = Integer.toString(n);
        System.out.println("This is a parsed int: " + Integer.parseInt(s));
        
        System.out.println("This is a string from an int: "+s);
        /*
            Other Methods :
            String s = String.valueOf(n);
            String s = Integer.toString(n);
            String s = "" + n;
        */ 
    }
    
}s