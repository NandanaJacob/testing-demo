package StringSearch;

import java.util.Arrays;

public class StringSort2 {

    public static void main(String[] args) {
        // Input string
        String input = "adbce";
        System.out.println("Original String: " + input);

        // Perform Quick Sort
        System.out.println("Quick Sort Result: " + quickSortString(input));

        // Perform Merge Sort
        System.out.println("Merge Sort Result: " + mergeSortString(input));

        // Perform Shell Sort
        System.out.println("Shell Sort Result: " + shellSortString(input));
    }

    // Quick Sort Function
    public static String quickSortString(String str) {
        char[] arr = str.toCharArray();
        quickSort(arr, 0, arr.length - 1);
        return new String(arr);
    }

    private static void quickSort(char[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(char[] arr, int low, int high) {
        char pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Merge Sort Function
    public static String mergeSortString(String str) {
        char[] arr = str.toCharArray();
        mergeSort(arr, 0, arr.length - 1);
        return new String(arr);
    }

    private static void mergeSort(char[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(char[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        char[] leftArray = new char[n1];
        char[] rightArray = new char[n2];

        System.arraycopy(arr, left, leftArray, 0, n1);
        System.arraycopy(arr, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArray[i++];
        }

        while (j < n2) {
            arr[k++] = rightArray[j++];
        }
    }

    // Shell Sort Function
    public static String shellSortString(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                char temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
        return new String(arr);
    }
}
