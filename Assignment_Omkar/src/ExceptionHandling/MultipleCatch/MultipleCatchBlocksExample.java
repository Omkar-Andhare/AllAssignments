package ExceptionHandling.MultipleCatch;

public class MultipleCatchBlocksExample {

    public static void main(String[] args) {

        try {
            int[] ar = {1, 2, 3};
            System.out.println(ar[3]);
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException nullPointerException) {
            System.out.println("Caught NullPointerException: " + nullPointerException.getMessage());
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Caught ArithmeticException: " + arithmeticException.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("arrayi" + e);
        } catch (Exception exception) {
            System.out.println("Caught Exception: " + exception.getMessage());
        } finally {
            System.out.println("---------------This Finally block i am always run-----------");
        }

        System.out.println("---------------terminated------------------");
    }
}
