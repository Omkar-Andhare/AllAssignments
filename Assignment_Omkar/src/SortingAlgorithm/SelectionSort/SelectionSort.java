package SortingAlgorithm.SelectionSort;

public class SelectionSort {


    public static void main(String[] args) {
        int arr[] = {43, 41, 65, 89, 97};
//        ascSort(arr);
        descSort(arr);
        printArray(arr);
    }

    static void ascSort(int arr[]) {

        int arrayLength = arr.length;

        for (int i = 0; i < arrayLength - 1; i++) {
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

    static void descSort(int arr[]) {

        int arrayLength = arr.length;

        for (int i = arrayLength - 1; i >= 0; i--) {
            int minIndex = i;
            for (int j = i - 1; j >= 0; j--) {
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
