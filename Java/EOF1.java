import java.util.Scanner;

public class EOF1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i =1;
        while(scan.hasNext())
        {
            String str = scan.nextLine();
            System.out.print(i+" " +str);
            System.out.println("");
            i++;
        }
        scan.close();
    }
    
}