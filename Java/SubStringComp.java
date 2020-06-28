import java.util.Scanner;

public class SubStringComp {

    public static String getSmallestAndLargest(String s, int k) {
        String current_substring = s.substring(0,k);
        String largest = current_substring;
        String smallest = current_substring;
        for(int i = 1 ;i <= (s.length()-k);i++)
        {
            current_substring = s.substring(i,i+k);
            if(current_substring.compareTo(smallest)<0)
                smallest=current_substring;
            if(current_substring.compareTo(largest)>0)
                largest = current_substring;
        }
        
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        if(s.length()<=0||s.length()>1000)
            System.exit(0);
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}