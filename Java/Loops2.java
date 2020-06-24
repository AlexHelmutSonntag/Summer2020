import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();
        while (true) {
            if (q >= 0 && q <= 500)
                break;
            System.out.println("Enter a no. between 0 and 500: ");
            q = scan.nextInt();
        }

        for (int i = 1; i <= q; i++) {
            /*------------Reading input-------------*/
            int a = scan.nextInt();
            while (true) {
                if (a >= 0 && a <= 50)
                    break;
                System.out.println("Enter a no. between 0 and 50: ");
                a = scan.nextInt();
            }
            int b = scan.nextInt();
            while (true) {
                if (b >= 0 && b <= 50)
                    break;
                System.out.println("Enter a no. between 0 and 50: ");
                b = scan.nextInt();
            }
            int n = scan.nextInt();
            while (true) {
                if (n >= 0 && n <= 15)
                    break;
                System.out.println("Enter a no. between 1 and 15: ");
                n = scan.nextInt();
            }
            /*---------Printing Result-------*/
            int result = a;
            for (int j = 0; j < n; j++) {

                result += (int) (Math.pow(2, j)) * b;
                System.out.print(result + " ");

            }
            System.out.println("");
        }

        scan.close();
    }

}