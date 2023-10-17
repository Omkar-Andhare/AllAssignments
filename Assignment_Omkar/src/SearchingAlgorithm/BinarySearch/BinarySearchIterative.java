package SearchingAlgorithm.BinarySearch;

public class BinarySearchIterative {

    public static int isBinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int arr[] = {3, 11, 13, 16, 19, 21, 27, 29, 32, 33, 37, 45, 49, 52};
        int lengthOfArray = arr.length;
        int key = 37;
        int result = isBinarySearch(arr, key);
        if (result == 1) {
            System.out.println("Element is not present in array ");
        } else {
            System.out.println("Element is present");
        }

    }
}
