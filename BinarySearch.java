public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        // Edge case: empty array
        if (arr.length == 0) {
            return -1; // Target not found
        }

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        // Example sorted array
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Search for an existing element
        int target = 7;
        int result = binarySearch(sortedArray, target);
        System.out.println("Target found at index: " + result); // Output: 6

        // Edge case: search in an empty array
        System.out.println("Edge Case - Search in empty array: " + binarySearch(new int[]{}, 5)); // Output: -1

        // Edge case: search for a non-existing element
        System.out.println("Edge Case - Search for a non-existing element: " + binarySearch(sortedArray, 11)); // Output: -1
    }
}
