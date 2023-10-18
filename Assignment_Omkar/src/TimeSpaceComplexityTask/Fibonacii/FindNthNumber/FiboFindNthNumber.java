package TimeSpaceComplexityTask.Fibonacii.FindNthNumber;

import java.util.Scanner;

public class FiboFindNthNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int previous = 0;
        int current = 1;
        int next = 0;
        int result = 0;
        System.out.println("\n Enter the n th position for getting digit of fibonacci series: ");
        int n = sc.nextInt();

        if (n == 1) {
            result = previous;
        } else if (n == 2) {
            result = current;
        }
        if (n > 2) {
            for (int i = 2; i < n; i++) {
                System.out.println("next >> " + next);
                next = previous + current;
                previous = current;
                current = next;
            }
            result = next;
        }
        System.out.println(result);
    }
}



