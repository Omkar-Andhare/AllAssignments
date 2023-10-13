package TimeSpaceComplexityTask.controller;

import TimeSpaceComplexityTask.service.IOperation;
import TimeSpaceComplexityTask.serviceimpl.FibonacciImpl;

import java.util.Scanner;

//Write a Java function that takes integer 'n' as a input & returns nth number in the
// Fibonacci sequence . Analyze the Time & space Complexity of the function.

// time complexity = O(n)
// space complexity = O(1)

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IOperation nthNumber = new FibonacciImpl();
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        System.out.println("The " + number + "th Number Of Fibonacci number is: " + nthNumber.findNthNumber(number));

    }
}
