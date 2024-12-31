public class SlidingWindows {
    public static int maxSumOfSubarray(int[] arr, int k) {
    	System.out.println(arr.length);
        if (arr.length < k) {
            throw new IllegalArgumentException("Array length must be at least as large as the window size.");
        }

        // Calculate the sum of the first window
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i]; 
        }
        int currentSum = maxSum; 

        // Slide the window from start to end of the array
        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - k]; 
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSumOfSubarray(arr, k));
    }

}
