import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.trim();
        if(s.length()==0){
            System.out.println(0);
            return;
        }
        // String str = "This is an example string, right?  Yes!";
        // String delims = "[ .,?!]+";
        // String[] tokens = str.split(delims);
        String[] words = s.split("[^a-zA-Z]+");
        System.out.println(words.length);
        for(String current : words)
        {
            System.out.println(current);
        }
    }
    
}