import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int n = scan.nextInt();
        while(true)
        {
            if(n>=2&&n<=20)
                break;
            System.out.println("Please enter a positive number(between 2 and 20): ");
            n = scan.nextInt();
        }
        for (int i =1;i<=10;i++)
        {
            String str = Integer.toString(n)+ " x " + Integer.toString(i) +" = "+ Integer.toString(n*i);
            System.out.println(str);
        }
        scan.close();
        
    }
    
}