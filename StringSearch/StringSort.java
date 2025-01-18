package StringSearch;

import java.util.Arrays;

public class StringSort {

    // Bubble Sort
    public static String bubbleSort(String input) {
        char[] arr = input.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return new String(arr);
    }

    // Insertion Sort
    public static String insertionSort(String input) {
        char[] arr = input.toCharArray();
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            char key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return new String(arr);
    }

    // Quick Sort
    public static String quickSort(String input) {
        char[] arr = input.toCharArray();
        quickSortHelper(arr, 0, arr.length - 1);
        return new String(arr);
    }

    private static void quickSortHelper(char[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSortHelper(arr, low, pi - 1);
            quickSortHelper(arr, pi + 1, high);
        }
    }

    private static int partition(char[] arr, int low, int high) {
        char pivot = arr[high];
        int i = (low - 1); // Index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        char temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Main function to test sorting algorithms
    public static void main(String[] args) {
        String input = "programming";

        System.out.println("Original String: " + input);
        System.out.println("Bubble Sort Result: " + bubbleSort(input));
        System.out.println("Insertion Sort Result: " + insertionSort(input));
        System.out.println("Quick Sort Result: " + quickSort(input));
    }
}
