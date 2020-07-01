import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();

    }
}

class MyRegex {
    // "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])" is for every case in the num
    // "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])"; different approach 
    String zeroTo255 = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = zeroTo255 +"\\."+ zeroTo255 +"\\."+ zeroTo255 +"\\."+ zeroTo255;
}