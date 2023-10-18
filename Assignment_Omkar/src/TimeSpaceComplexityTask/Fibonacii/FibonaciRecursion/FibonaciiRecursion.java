package TimeSpaceComplexityTask.Fibonacii.FibonaciRecursion;

import java.util.Scanner;

//find nth number from fibonaci series using recursion
public class FibonaciiRecursion {


    public static int fibonaciSeries(int n) {
        int previous = 0;
        int current = 1;
        if (n == 1) {
            return previous;
        } else if (n == 2) {
            return current;
        } else {
            return fibonaciSeries(n - 1) + fibonaciSeries(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number: ");
        int number = sc.nextInt();
        int result = fibonaciSeries(number);
        System.out.println("The " + number + "th Fibonacci number is: " + result);
    }
}


