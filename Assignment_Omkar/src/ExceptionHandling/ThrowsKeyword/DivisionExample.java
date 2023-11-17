package ExceptionHandling.ThrowsKeyword;

public class DivisionExample {

    public static double divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        int numerator = 4567;
        int denominator = 0;

        try {
            double result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception is " + e.getMessage());
        }
    }
}
