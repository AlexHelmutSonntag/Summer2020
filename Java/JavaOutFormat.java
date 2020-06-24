import java.util.Scanner;
public class JavaOutFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String str = sc.next();
            int num = sc.nextInt();
            /* % : formatter
               -15s : it means the string's minimum field is 15 and thus the string is of length fifteen and the rest is emtpy if it's less than 15.
               03d : it means the integer is of 3 digits and the rest gets 0 if it's smaller than this.
            */
            System.out.printf("%-15s%03d%n", str, num);
        }
        System.out.println("================================");
        sc.close();

}
    
}