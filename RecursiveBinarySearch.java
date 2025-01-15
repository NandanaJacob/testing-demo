public class RecursiveBinarySearch {
    // Recursive binary search method
    public static int binarySearch(int[] arr, int target, int left, int right) {
        // Base case - element not found
        if (left > right) {
            return -1;
        }
        
        // Calculate middle index
        int mid = left + (right - left) / 2;
        
        // If element is found at middle
        if (arr[mid] == target) {
            return mid;
        }
        
        // If element is smaller than middle, search in left subarray
        if (target < arr[mid]) {
            return binarySearch(arr, target, left, mid - 1);
        }
        
        // If element is larger than middle, search in right subarray
        return binarySearch(arr, target, mid + 1, right);
    }
    
    // Helper method to make the recursive call easier
    public static int search(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }
    
    public static void main(String[] args) {
        // Test array (must be sorted)
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        
        // Test cases
        int[] targets = {23, 5, 91, 50};
        
        // Search for each target
        for (int target : targets) {
            int result = search(arr, target);
            
            if (result == -1) {
                System.out.println(target + " is not found in the array");
            } else {
                System.out.println(target + " is found at index " + result);
            }
        }
    }
}