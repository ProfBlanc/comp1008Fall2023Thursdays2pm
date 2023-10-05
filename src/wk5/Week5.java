package wk5;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Week5 {

    static void example1(){
        /*
            RegEX
                Regular Expressions
                    advanced searching

            regex101.com

            Positioning

            ^           start of string
            $           end of string

            Grouping

            |           either or
            ()          group whole text
            []          match any character in brackets
            [start-end] match range of characters
            [^values]
            [^start-end]    all except what is within ranges

            Special characters

            \       literal that character
            .       match any single character
            +       repeat one or many times
            *       repeat zero or many times
            ?       zero or many times (optionally)

            repetition
            {N}         repeat exactly N times
            {N,}        repeat at least N times
            {N,M}       repeat between N and M times (inclusive)

            shortcuts
           \d               [0-9]
           \D               [^0-9]
           \s               [ \t\n\r\v]
           \S               [^ \t\n\r\v]
           \w               [a-z0-9A-Z_]
           \W               [^a-zA-Z0-9]




^\d*\.?\d{0,2}$

10
10.10
1.0
.1
.10
0011.11
23.456



         */

    }
//([a-z]*[aeiou]+[a-z]*){3,}
    static void example2(){

        String text = "Hello. 705-5551234 My phone 7055551234 number is (705)555-1234. Call " +
                "705-555-1234or text me " +
                "anytime! End of text";
        String regex = "\\(?\\d{3}\\)?-?\\d{3}-?\\d{4}";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){

            System.out.println("Text Matched = " + matcher.group());
            System.out.printf("Between Indexes %d and %d%n", matcher.start(), matcher.end());

        }
    }

    static void example3(){

        String text = "Hello. 705-5551234 My phone 7055551234 number is (705)555-1234. Call " +
                "705-555-1234 or text me " +
                "anytime! End of text";
        String regex = "\\(?\\d{3}\\)?-?\\d{3}-?\\d{4}";

        System.out.println(text.replaceAll(regex, "benny"));
    }

    public static void main(String[] args) {

        example3();
    }
}
