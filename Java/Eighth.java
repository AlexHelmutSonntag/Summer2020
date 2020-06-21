// This file is from 1:38:48 till 2:06:07
// It's about comparison/logical operators, If statements and switches

public class Eighth {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        System.out.println(x == y);// true
        System.out.println("##");// true
        x = 2;
        System.out.println(x == y);// false
        System.out.println("##");// true

        int temperature = 22;
        boolean isWarm = temperature >= 20 && temperature <= 30;
        System.out.println(isWarm);// true
        System.out.println("##");// true

        temperature = 12;
        isWarm = temperature >= 20 && temperature <= 30;
        System.out.println(isWarm);// false
        System.out.println("##");// true

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);// true
        System.out.println("##");// true

        // If statements
        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        } else if (temp > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");

        System.out.println("Enjoy your day");
        System.out.println("##");

        int income = 120_000;
        hasHighIncome = (income > 100_000);
        // The Trenary operator
        // It looks more professional and makes the code easier to read
        String className = hasHighIncome ? "First" : "Economy";
        System.out.println(className);
        System.out.println("##");

        /*----------------------------------------*/
        // Switch statements
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're  guest");
        }
        byte gpa = 5;
        switch (gpa) {
            case 1:
                System.out.println("You failed");
                break;
            case 2:
                System.out.println("You passed");
                break;
            case 3:
                System.out.println("Your scores are good");
                break;
            case 4:
                System.out.println("Your scores are very good");
                break;

            case 5:
                System.out.println("Your scores are excellent");
                break;

        }

    }

}