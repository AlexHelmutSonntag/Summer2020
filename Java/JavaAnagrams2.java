import java.util.Scanner;

public class JavaAnagrams2 {
    static boolean isAnagram(String a, String b) {
        int a_length = a.length();
        int b_length = b.length();

        if (a_length != b_length) {
            return false;
        }
        int[] char_frequencies = new int[26];
        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i = 0; i < a_length; i++) {
            char current_char = a.charAt(i);
            int index = current_char - 'a';
            char_frequencies[index]++;
        }

        for (int i = 0; i < b_length; i++) {
            char current_char = b.charAt(i);
            int index = current_char - 'a';
            char_frequencies[index]--;
        }
        for (int i = 0; i < 26; i++) {
            if (char_frequencies[i] != 0)
                return false;
        }
        return true;
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