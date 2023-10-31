package StringBuilderClass;

public class StringBuilderPractice {
    public static void main(String[] args) {
        String initialString = "Hi Omkar this side";

        // Creating a StringBuilder from the initial string
        StringBuilder sb = new StringBuilder(initialString);
        System.out.println("Initial StringBuilder: " + sb);

        // Appending text
        sb.append(" - Welcome!");
        System.out.println("Appended Text: " + sb);

        // Inserting text at a specific position
        sb.insert(13, "to ");
        System.out.println("Inserted Text: " + sb);

        // Deleting characters within a range
        sb.delete(0, 13);
        System.out.println("Deleted Text: " + sb);

        // Replacing characters
        sb.replace(0, 4, "Hello");
        System.out.println("Replaced Text: " + sb);

        // Reversing the string
        sb.reverse();
        System.out.println("Reversed Text: " + sb);

        // Getting the length
        int length = sb.length();
        System.out.println("Length: " + length);

        // Getting the capacity
        int capacity = sb.capacity();
        System.out.println("Capacity: " + capacity);

        // Setting the capacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensuring: " + sb.capacity());

        // Index of a character or substring
        int indexOfOmkar = sb.indexOf("Omkar");
        System.out.println("Index of 'Omkar': " + indexOfOmkar);

        // Converting StringBuilder to String
        String finalString = sb.toString();
        System.out.println("Converted to String: " + finalString);
    }
}


