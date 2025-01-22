package collectionprog;

import java.util.Arrays;

public class InterpolationSearch {

    // Function to perform Interpolation Search
    public static int interpolationSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            // Calculate the position using the formula
            int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            // If the target is found
            if (arr[pos] == target) {
                return pos;
            }

            // If the target is larger, move to the right part
            if (arr[pos] < target) {
                low = pos + 1;
            }
            // If the target is smaller, move to the left part
            else {
                high = pos - 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        // Test datasets
        int[] dataset1 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] dataset2 = {5, 15, 25, 35, 45, 55, 65, 75};

        // Test targets
        int target1 = 40;
        int target2 = 15;
        int target3 = 100; // Element not in the dataset

        // Sort datasets (interpolation search requires sorted datasets)
        Arrays.sort(dataset1);
        Arrays.sort(dataset2);

        System.out.println("Dataset 1: " + Arrays.toString(dataset1));
        System.out.println("Searching for " + target1 + "...");
        int result1 = interpolationSearch(dataset1, target1);
        System.out.println(result1 != -1 ? "Found at index: " + result1 : "Not found");

        System.out.println("\nDataset 2: " + Arrays.toString(dataset2));
        System.out.println("Searching for " + target2 + "...");
        int result2 = interpolationSearch(dataset2, target2);
        System.out.println(result2 != -1 ? "Found at index: " + result2 : "Not found");

        System.out.println("\nSearching for " + target3 + " in Dataset 1...");
        int result3 = interpolationSearch(dataset1, target3);
        System.out.println(result3 != -1 ? "Found at index: " + result3 : "Not found");
    }
}
