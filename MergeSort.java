import java.util.Arrays;

public class MergeSort {

    // Merge Sort function
    public static int[] mergeSort(int[] array) {
        // Base case: if the array has 1 or no elements, it's already sorted
        if (array.length <= 1) {
            return array;
        }

        // Split the array into two halves
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        // Recursively sort both halves
        left = mergeSort(left);
        right = mergeSort(right);

        // Merge the sorted halves
        return merge(left, right);
    }

    // Merge function to combine two sorted arrays
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        // Compare elements from both arrays and add the smaller one to the result
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Add remaining elements from the left array
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Add remaining elements from the right array
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array: " + Arrays.toString(array));

        // Sort the array using Merge Sort
        int[] sortedArray = mergeSort(array);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
