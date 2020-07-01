import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExplained {
    public static void main(String[] args) {

        // String regular_expression = ".";

        // This one matches for any character except newline and it depends on the number of dots. 
        // for example, if it was ".." and the text was "SS" or any other two letters, it would match true.
        
        // String regular_expression = "\\w\\w";
        
        // This one matches for word character (a-z,A-Z,0-9, _)
        // If it's "\\w\\w"; and text is "SS" it is true. 
        // String text = "%%";this is false because it is not included in (a-z,A-Z,0-9, _)
        
        // String regular_expression = "\\W";
        // This one matches for NOT word character (a-z,A-Z,0-9, _)
        // String text = "%"; true because % is not a word character
        // String text ="%";

        // String regular_expression= "\\w\\W";
        // String text = "R%";//True because R is a word character and % is not a word character
        
        // String regular_expression = "\\s";
        // This one matches for white spaced characters. Similar as [\t\n\r\f ]

        // String text = " ";//true
        
        // String regular_expression = "\\S";
        // This one matches for NOT white spaced characters
        // String text = "Y"; // true because it is not a whitespace character


        // String regular_expression = "\\d";
        // String regular_expression = "[0-9]{1,2}";//This one takes any digit of length from 1 till 2 

        // This one matches for any digit[0-9];
        // String text = "6"; // true
        
        String regular_expression = "\\D";
        // This one is for any nonDigits
        String text = "s";//true
        Pattern pattern = Pattern.compile(regular_expression);
        Matcher match = pattern.matcher(text);

        boolean result = match.matches();
        System.out.println(result);
    }
} 