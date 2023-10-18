package SearchingAlgorithm.LinearSearch;

import java.util.Scanner;

public class SearchInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of an array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array element: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the number that you want to search the index of that element");
        int ele = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                System.out.println("Element found at " + i + "th index");
                break;
            }
        }
    }
}
