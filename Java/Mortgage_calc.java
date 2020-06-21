import java.text.NumberFormat;
import java.util.Scanner;
// This wasn't done with input validation yet.

public class Mortgage_calc {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        while (true) {
            System.out.print("Principal($1K - $ 1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1K and 1M");
        }

        float annualInterest = 0;
        while (true) {
            System.out.print("Annual Interest rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest > 0 && annualInterest <= 30)
                break;
            System.out.println("Enter a number between 1 and 30");
        }
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        byte years = 0;
        while (true) {
            System.out.print("Period(Years): ");
            years = scanner.nextByte();
            if (years > 0 && years <= 30)
                break;
            System.out.println("Enter a number between 1 and 30 ");
        }
        int numberOfPayments = years * MONTHS_IN_YEAR;
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + result);
    }

}
