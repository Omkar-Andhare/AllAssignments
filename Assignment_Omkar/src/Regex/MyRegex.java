package Regex;

import java.util.Scanner;
import java.util.regex.*;


public class MyRegex {


    public static void main(String[] args) {


        String zeroTo255 = "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";
        String regex = zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("192.168.0.1");
        boolean b = matcher.matches();
        System.out.println(b);
    }

}



