package OOPsAssignment.LoanTypes.serviceImpl;

public class CalculateTotalAmount {

    /**
     * calculate totalPayable amount according to reducing interest rate and return it
     */
    public double TotalAmountReducingInterest(double INTEREST_RATE, double principle, int months) {
        double monthlyInterestRate = INTEREST_RATE / 12 / 100; // Convert to monthly rate
        double EMI = (principle * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, months))
                / (Math.pow(1 + monthlyInterestRate, months) - 1);
        double totalInterest = (EMI * months) - principle;

        return principle + totalInterest;
    }

    /**
     * calculate totalPayable amount according to flat interest rate and return it
     */
    public double TotalAmountFlatInterest(double INTEREST_RATE, double principal, int months) {

        double monthlyInterestRate = INTEREST_RATE / 12 / 100;

        double emi = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, months))
                / (12 * (Math.pow(1 + monthlyInterestRate, months) - 1));

        double totalInterest = (emi * months) - principal;
        return emi * months;
    }
}
