package SortingAlgorithm.InsersionSort;

import java.util.Scanner;

public class InsersionSorting {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the element of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Before sorting Array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 1; i < size; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println(" after sorting array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
