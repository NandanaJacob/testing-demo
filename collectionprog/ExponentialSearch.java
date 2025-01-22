package collectionprog;

public class ExponentialSearch {
    
    // Method to perform binary search
    public static int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (arr[mid] == target) {
                return mid; // Target found
            }

            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            } else { // If target is smaller, ignore right half
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }

    // Method to perform exponential search
    public static int exponentialSearch(int[] arr, int target) {
        if (arr[0] == target) {
            return 0; // Target found at index 0
        }

        int i = 1;
        // Find the range where target may be present
        while (i < arr.length && arr[i] <= target) {
            i *= 2; // Exponentially increase the index
        }

        // Perform binary search in the found range
        return binarySearch(arr, i / 2, Math.min(i, arr.length - 1), target);
    }

    public static void main(String[] args) {
        // Sorted array
        int[] arr = {2, 3, 4, 10, 40, 50, 60, 70, 80, 90};
        int target = 10;

        // Perform exponential search
        int result = exponentialSearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
