package ExceptionHandling.MultipleCatch;

public class MultipleExceptions {
    public static void main(String[] args) {

        try {
            int[] numbers = {1234567890, 987654321, 123456789};
            String str = null;

            System.out.println(numbers[4]);
            System.out.println(str.length());
        } catch (ArrayIndexOutOfBoundsException arrayIndexException) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + arrayIndexException.getMessage());
        } catch (NullPointerException nullPointerException) {
            System.out.println("Caught NullPointerException: " + nullPointerException.getMessage());
        } catch (Exception exception) {
            System.out.println("Caught Exception: " + exception.getMessage());
        } finally {
            System.out.println("Finally block always run ");
        }

        System.out.println("execution continues of further statements: ");
    }
}
