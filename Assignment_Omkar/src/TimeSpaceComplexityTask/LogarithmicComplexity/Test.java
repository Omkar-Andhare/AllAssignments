package TimeSpaceComplexityTask.LogarithmicComplexity;

public class Test {
    public static void main(String[] args) {
        int n = 16;
        int count = 0;

        while (n > 1) {
            n = n / 2;
            count++;
        }
        System.out.println("Iterations: " + count);
    }
}

