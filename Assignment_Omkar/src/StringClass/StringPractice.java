package StringClass;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s=sc.nextLine();
//        System.out.println(s);
        String str = "Hello, Perennial!";

        // Length of the string
        int length = str.length();
        System.out.println("Length: " + length);

        // Character at a specific position
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // Substring
        String substring = str.substring(7, 12);
        System.out.println("Substring: " + substring);

        // Concatenation
        String newStr = str.concat(" This is a IT company.");
        System.out.println("Concatenated String: " + newStr);

        // Index of a character or substring
        int indexOfWorld = str.indexOf("Perennial");
        System.out.println("Index of 'Perennial': " + indexOfWorld);

        // Replacing characters
        String replacedStr = str.replace('e', 'w');
        System.out.println("Replaced String: " + replacedStr);

        // Converting to lowercase and uppercase
        String lowercase = str.toLowerCase();
        String uppercase = str.toUpperCase();
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Uppercase: " + uppercase);

        // Checking if the string starts or ends with a specific prefix/suffix
        boolean startsWithHello = str.startsWith("Hello");
        boolean endsWithWorld = str.endsWith("Perennial!");
        System.out.println("Starts with 'Hello': " + startsWithHello);
        System.out.println("Ends with 'Perennial!': " + endsWithWorld);

        // Splitting the string into an array of substrings
        String[] parts = str.split(", ");
        System.out.println("Split String:");
        for (String part : parts) {
            System.out.println(part);
        }

        // Removing leading and trailing whitespace
        String stringWithSpaces = "   Trim me!   ";
        String trimmedStr = stringWithSpaces.trim();
        System.out.println("Original: '" + stringWithSpaces + "'");
        System.out.println("Trimmed: '" + trimmedStr + "'");

        //multiline string
        // String multiLineString = "This is a multiline \n" +
//                "string in Java using \n" +
//                "string concatenation.";

        String s1;
        sc.useDelimiter("\\t");
        System.out.println("Enter the multi line string(for finish the output" +
                " enter the tab button and again press enter button) : ");
        while (true) {
            s1 = sc.next();
            break;
        }
        System.out.println(s1);

    }
}


