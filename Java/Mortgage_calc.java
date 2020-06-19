import java.text.NumberFormat;
import java.util.Scanner;
// This wasn't done with input validation yet.

public class Mortgage_calc {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest rate: ");
        // scanner = new Scanner(System.in);
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period(Years): ");
        // scanner = new Scanner(System.in);
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage = " + result);
    }

}