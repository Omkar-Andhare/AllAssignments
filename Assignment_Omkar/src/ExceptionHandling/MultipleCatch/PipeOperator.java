package ExceptionHandling.MultipleCatch;

public class PipeOperator {

    public static void main(String[] args) {

        try {
            int[] numbers = {1234567890, 987654321, 123456789};
            String str = null;

            System.out.println(numbers[4]);
            System.out.println(str.length());
        }

        // with pipe operator we can put only Exception which belong to same hierarchy
        catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);

        }
        System.out.println("execution continues of further statements: ");
    }
}
