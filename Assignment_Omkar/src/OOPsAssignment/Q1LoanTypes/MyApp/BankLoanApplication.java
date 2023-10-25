package OOPsAssignment.Q1LoanTypes.MyApp;

import OOPsAssignment.Q1LoanTypes.service.ILoanOperations;
import OOPsAssignment.Q1LoanTypes.serviceImpl.CarLoan;
import OOPsAssignment.Q1LoanTypes.serviceImpl.HomeLoan;
import OOPsAssignment.Q1LoanTypes.serviceImpl.PersonalLoan;

import java.util.Scanner;

public class BankLoanApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available Types Of Loan:- ");
        System.out.println("1. Home Loan ");
        System.out.println("2. Personal Loan ");
        System.out.println("3. Car Loan ");

        System.out.println("Select the loan (1/2/3)");
        int choice = scanner.nextInt();
        System.out.println("Enter the Principle amount: ");
        double principleAmount = scanner.nextDouble();
        System.out.println("Enter the duration in months");
        int months = scanner.nextInt();

        switch (choice) {
            case 1: {
                ILoanOperations homeLoan = new HomeLoan();
                System.out.println(homeLoan.calculateTotalPayable(principleAmount, months));
                break;
            }
            case 2: {
                ILoanOperations homeLoan = new PersonalLoan();
                System.out.println(homeLoan.calculateTotalPayable(principleAmount, months));
                break;
            }
            case 3: {
                ILoanOperations homeLoan = new CarLoan();
                System.out.println(homeLoan.calculateTotalPayable(principleAmount, months));
                break;
            }
            default: {
                System.out.println("Invalid Selection of Loan Type!!!!!!!!!!!!!");
                break;
            }
        }
    }
}
