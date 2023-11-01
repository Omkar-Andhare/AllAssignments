package StringBuilderClass.GeneratingRandomString;

import java.util.Random;

public class RandomString {


    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            stringBuilder.append(randomChar);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        int stringLength = 19; // Specify the length of the random string you want to generate.
        String randomString = generateRandomString(stringLength);
        System.out.println("Random String: " + randomString);
    }
}




