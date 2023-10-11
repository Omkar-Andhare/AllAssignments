package CleanCode;//WAP to take choice from user, which operation hw is willing to perform out of
//        1) Check if given number is a Armstrong Number
//        2) check if a number is Even or Odd
//        3) Check if a number is a palindrome or not
//        Take input from user for number to be checked & provide the response for the users selected operation.

//1. Operations is interface and OperationImplementations class is implentation class
//2. while() is used for viewing options repeatedly and selection
//3. after selection of option switch case is used

import java.util.Scanner;
import java.util.logging.Logger;

public class MainNumberOperations {

    private static final Logger LOGGER = Logger.getLogger(MainNumberOperations.class.getName());

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        OperationImplementations operationImplementations = new OperationImplementations();
        int choice;
        int number;
        boolean flag = true;


        while (flag) {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("1. Check a given number is Armstrong number or not. ");
            System.out.println("2. Check a given number is Even or Odd ");
            System.out.println("3. Check a given number is Palindrome or not. ");
            System.out.println("4. Exit");
            System.out.println("--------------------------------------------------------------------------------");

            System.out.println("Enter the choice for performing operation: ");
            choice = sc.nextInt();

            LOGGER.info("-----Choice number accepted for performing operations-----");

            if (choice == 4) {
                System.out.println("Exited successfully 😇");
                System.exit(0);
            }

            System.out.println("Enter the number for performing operation: ");
            number = sc.nextInt();


            LOGGER.info("-----Number is accepted for performing operations-----");

            switch (choice) {
                case 1:
                    if (operationImplementations.isArmstrongNumber(number)) {
                        System.out.println(number + ": is Armstrong number");
                    } else {
                        System.out.println(number + ": is not Armstrong number");
                    }
                    LOGGER.info("-----Choice number " + choice + " operation performed successfully-----");
                    break;

                case 2:

                    if (operationImplementations.isEvenOrOddNumber(number)) {
                        System.out.println(number + ": is Even number");
                    } else {
                        System.out.println(number + ": is Odd number");
                    }
                    LOGGER.info("-----Choice number " + choice + " operation performed successfully-----");

                    break;
                case 3:

                    if (operationImplementations.isPalindromeNumber(number)) {
                        System.out.println(number + ": is Palindrome number");
                    } else {
                        System.out.println(number + ": is not palindrome number");
                    }
                    LOGGER.info("-----Choice number " + choice + " operation performed successfully-----");
                    break;


                default:
                    System.out.println("Invalid Input");
                    LOGGER.info("You should provided proper number of choice for selection of operation as given on display");
                    break;

            }

        }
    }
}