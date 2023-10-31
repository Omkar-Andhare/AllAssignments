package OOPsAssignment.LoanTypes.serviceImpl;

import OOPsAssignment.LoanTypes.service.ILoanOperations;

public class CarLoan implements ILoanOperations {
    public static final double INTEREST_RATE = 7.5;//7.5% for Car Loan

    @Override
    /**
     * calling TotalAmount() for getting totalPayable
     */
    public double calculateTotalPayable(double principle, int months) {
        CalculateTotalAmount calculateTotalAmount = new CalculateTotalAmount();
        double totalPayable = calculateTotalAmount.TotalAmountReducingInterest(INTEREST_RATE, principle, months);
        return totalPayable;
    }
}