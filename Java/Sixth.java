import java.text.NumberFormat;

// This file starts from 1:19:51 till 1:25:40
// This file is about formatting numbers

public class Sixth {
    public static void main(String[] args) {
        // We cannot create an instance of the NumberFormat class because it is abstract
        // NumberFormat currency = new NumberFormat(); //WRONG!
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);
        NumberFormat percentage = NumberFormat.getPercentInstance();
        result = percentage.format(0.1);
        System.out.println(result);// 10%
        // Because NumberFormat.getCurrencyInstance() returns a NumberFormat object so
        // we could use the dot operator to access the methods of NumberFormat object
        // This is called Method chaining
        result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result); // 10%

    }

}