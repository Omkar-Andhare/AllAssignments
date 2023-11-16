package HackerRankProblems;

import java.util.Scanner;

/**
 * The first column contains the String and is left justified using exactly  characters.
 * The second column contains the integer, expressed in exactly  digits;
 * if the original input has less than three digits,
 * you must pad your output's leading digits with zeroes
 */
public class Problem1 {
    public static void main(String[] args) {
        String s1 = null;
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            s1 = sc.next();
            x = sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);

        }

        System.out.println("================================");
    }

}
