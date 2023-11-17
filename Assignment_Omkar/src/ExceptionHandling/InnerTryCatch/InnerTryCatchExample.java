package ExceptionHandling.InnerTryCatch;

public class InnerTryCatchExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block starts.");

            try {
                // Inner try block
                System.out.println("Inner try block starts.");

                int result = 10 / 0;
                System.out.println("Inner try block ends.");
                //inner try block end
            } catch (ArithmeticException innerException) {
                System.out.println("ArithmeticException caught in the inner catch block: " + innerException.getMessage());
            }

            System.out.println("Outer try block continues.");
            //outer try block end

        } catch (Exception outerException) {
            System.out.println("Exception caught in the outer catch block: " + outerException.getMessage());
        }

        System.out.println("End of the program.");
    }
}
