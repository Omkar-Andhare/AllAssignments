package ExceptionHandling.MultipleCatch;

public class Practice {
    public static void main(String[] args) {
        int a = 9;
        try {
            a = 10/0;
            System.out.println("try here");
        } catch (Exception e) {
            System.exit(0);


        } finally {

            System.out.println("Hi finally here ");
            System.out.println(a);
        }

    }
}
