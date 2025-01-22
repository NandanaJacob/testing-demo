package collectionprog;

import java.util.Arrays;
import java.util.Random;

public class CompareSorts{

    public static void main(String[] args) {
        int[] inputSizes = {100, 1000, 10000, 50000}; // Input sizes for comparison

        System.out.printf("%-15s %-15s %-15s %-15s%n", "Input Size", "Bubble Sort (ms)", "Merge Sort (ms)", "Quick Sort (ms)");
        System.out.println("-----------------------------------------------------------------");

        for (int size : inputSizes) {
            int[] arr = generateRandomArray(size);

            // Measure Bubble Sort
            int[] bubbleArr = Arrays.copyOf(arr, arr.length);
            long bubbleStart = System.currentTimeMillis();
            bubbleSort(bubbleArr);
            long bubbleEnd = System.currentTimeMillis();

            // Measure Merge Sort
            int[] mergeArr = Arrays.copyOf(arr, arr.length);
            long mergeStart = System.currentTimeMillis();
            mergeSort(mergeArr);
            long mergeEnd = System.currentTimeMillis();

            // Measure Quick Sort
            int[] quickArr = Arrays.copyOf(arr, arr.length);
            long quickStart = System.currentTimeMillis();
            quickSort(quickArr, 0, quickArr.length - 1);
            long quickEnd = System.currentTimeMillis();

            // Display results
            System.out.printf("%-15d %-15d %-15d %-15d%n", size, (bubbleEnd - bubbleStart), (mergeEnd - mergeStart), (quickEnd - quickStart));
        }
    }

    // Generate an array with random integers
    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size);
        }
        return arr;
    }

    // Bubble Sort
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort
    private static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    // Quick Sort
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
