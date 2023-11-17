package ExceptionHandling.CustomException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ATMPinCheckException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the pin: ");
        String pin = scanner.next();
        if (pin.equals("7890")) {
            System.out.println("Success");
        } else {
            throw new ATMPinCheckException("You entered wrong pin");
        }
    }
}
