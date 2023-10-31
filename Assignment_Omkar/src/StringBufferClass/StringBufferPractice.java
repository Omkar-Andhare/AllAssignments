package StringBufferClass;

public class StringBufferPractice {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer sb = new StringBuffer("Hello, Perennial!");

        // Appending text
        sb.append(" This is a IT company.");
        System.out.println("Appended Text: " + sb);

        // Inserting text at a specific position
        sb.insert(7, "Awesome ");
        System.out.println("Inserted Text: " + sb);

        // Reversing the string
        sb.reverse();
        System.out.println("Reversed Text: " + sb);

        // Deleting characters within a range
        sb.delete(7, 16);
        System.out.println("Deleted Text: " + sb);

        // Replacing characters
        sb.replace(7, 16, "Buddy");
        System.out.println("Replaced Text: " + sb);

        // Getting the capacity
        int capacity = sb.capacity();
        System.out.println("Capacity: " + capacity);

        // Setting the capacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensuring: " + sb.capacity());

        // Getting the length
        int length = sb.length();
        System.out.println("Length: " + length);

        // Setting the length
        sb.setLength(10);
        System.out.println("New Length: " + sb.length());

        // Converting StringBuffer to String
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }
}


