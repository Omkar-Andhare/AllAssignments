package OOPsAssignment.LoanTypes.serviceImpl;

import OOPsAssignment.LoanTypes.service.ILoanOperations;

public class PersonalLoan implements ILoanOperations {
    private static final double INTEREST_RATE = 13;//13% for personal loan

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
