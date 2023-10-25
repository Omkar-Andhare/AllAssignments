package OOPsAssignment.Q1LoanTypes.serviceImpl;

import OOPsAssignment.Q1LoanTypes.service.ILoanOperations;

public class CarLoan implements ILoanOperations {
    public static final double INTEREST_RATE = 7.5;//7.5% for Car Loan

    @Override
    public double calculateTotalPayable(double principle, int months) {
        double monthlyInterestRate = INTEREST_RATE / 12 / 100; // Convert to monthly rate
        double EMI = (principle * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, months))
                / (Math.pow(1 + monthlyInterestRate, months) - 1);
        double totalInterest = (EMI * months) - principle;

        return principle + totalInterest;
    }
}
