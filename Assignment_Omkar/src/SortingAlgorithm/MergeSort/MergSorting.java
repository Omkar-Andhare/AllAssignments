package SortingAlgorithm.MergeSort;

public class MergSorting {

    public static void conquer(int arr[], int starting_index, int mid, int ending_index) {
        int merged[] = new int[ending_index - starting_index + 1];

        int index1 = starting_index;
        int index2 = mid + 1;
        int x = 0;

        while (index1 <= mid && index2 <= ending_index) {
            if (arr[index1] <= arr[index2]) {
                merged[x] = arr[index1];
                x++;
                index1++;
            } else {
                merged[x] = arr[index2];
                x++;
                index2++;
            }
        }

        while (index1 <= mid) {
            merged[x] = arr[index1];
            x++;
            index1++;
        }

        while (index2 <= ending_index) {
            merged[x] = arr[index2];
            x++;
            index2++;
        }
        for (int i = 0, j = starting_index; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int starting_index, int ending_index) {


        if (starting_index == ending_index) {
            return;
        }
        int mid = starting_index + (ending_index - starting_index) / 2;
        divide(arr, starting_index, mid);

        divide(arr, mid + 1, ending_index);
        conquer(arr, starting_index, mid, ending_index);

    }

    public static void main(String[] args) {

        int[] arr = {6, 7, 2, 9, 4, 8};
        int length = arr.length;
        divide(arr, 0, length - 1);

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
