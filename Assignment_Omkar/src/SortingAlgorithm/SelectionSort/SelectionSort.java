package SortingAlgorithm.SelectionSort;

public class SelectionSort {


    public static void main(String[] args) {
        int arr[] = {43, 41, 65, 89, 97};
        sort(arr);
        printArray(arr);
    }

    static void sort(int arr[]) {

        int arrayLength = arr.length;

        for (int i = 0; i < arrayLength; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrayLength; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
