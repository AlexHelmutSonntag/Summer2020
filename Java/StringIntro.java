import java.util.Scanner;
public class StringIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        if(A.length()==0||B.length()==0)
        {
            System.out.println(0);
            return;
        }
        int sum = A.length() + B.length();
        System.out.println(sum);
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
        
        
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(A + " " +B);

    }

}