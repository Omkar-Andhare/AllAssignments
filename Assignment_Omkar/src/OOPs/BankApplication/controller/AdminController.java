package OOPs.BankApplication.controller;

import OOPs.BankApplication.sbi.service.RBI;
import OOPs.BankApplication.sbi.serviceImpl.SBI;

import java.util.Scanner;

public class AdminController {
    public static int choice() {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        return choice;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        RBI rbi = new SBI();
        do {
            System.out.println("\n===MENU===");
            System.out.println("1. Open Account");
            System.out.println("2. Display Account Balance");
            System.out.println("3. Display Account Details");
            System.out.println("4. Deposit Amount");
            System.out.println("5. Withdraw Amount");
            System.out.println("6. Update Profile Details");
            System.out.println("7. Exit The Application");

            System.out.println("Select One Of The Above Menu");
            int ch = choice();

            switch (ch) {
                case 1:
                    rbi.createAccount();
                    break;
                case 2:
                    rbi.displayBalance();
                    break;
                case 3:
                    rbi.displayDetails();
                    break;
                case 4:
                    rbi.depositeAmount();
                    break;
                case 5:
                    rbi.withdrawAmount();
                    break;
                case 6:
                    rbi.updateProfile();
                    break;
                case 7:
                    System.out.println("Exit Successfully");
                    System.out.println("---------------------THANK YOU---------------------");
                    flag = false;
                    break;
                default:
                    System.out.println("InValid Input");
                    break;
            }
        } while (flag);

    }

}
