import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        if (S.length() <= 0 || S.length() > 100)
            System.exit(0);
        int start = in.nextInt();
        int end = in.nextInt();
        if (start < 0 || start > S.length() || start > end || end > S.length())
            System.exit(0);
        // System.out.println("Flag");
        System.out.println(S.substring(start, end));
        in.close();
    }

}