import java.util.Arrays;
import java.util.Scanner;
// This solution is with importing Arrays
public class JavaAnagrams1 {
    static boolean isAnagram (String a, String b) {
        int a_length = a.length();
        int b_length = b.length();

        if (a_length != b_length) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        char [] a_chars = a.toCharArray();
        char [] b_chars = b.toCharArray();
        Arrays.sort(a_chars);
        Arrays.sort(b_chars);
        // a = a_chars.toString();
        // b = b_chars.toString();
        return Arrays.equals(a_chars, b_chars);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean flag = isAnagram(a, b);
        System.out.println((flag) ? "Anagrams" : "Not Anagrams");

    }

}