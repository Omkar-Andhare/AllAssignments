package ExceptionHandling.TryCatchFinallyBasics;

public class TryCatchFinallyExample {

    public static void main(String[] args) {
        System.out.println("----------------Program execution Started------------");
        try {
            // Code that might throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);  // This line won't be executed due to the exception
        } catch (ArithmeticException e) {
            // for handling the exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Code that will always be executed, whether an exception occurs or not
            System.out.println("Finally block executed.");
        }

        System.out.println("-----------Program terminated-------------");
    }

    private static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
