public class FibonacciComparison {
    
    // Simple recursive approach
    public static long fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
    
    // Print Fibonacci series using recursion
    public static void printFibSeriesRecursive(int n) {
        System.out.print("Recursive Fibonacci Series: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibRecursive(i) + " ");
        }
        System.out.println();
    }
    
    // Dynamic Programming approach using tabulation (bottom-up)
    public static void printFibSeriesIterative(int n) {
        System.out.print("Iterative Fibonacci Series: ");
        
        if (n < 0) return;
        
        if (n >= 0) System.out.print("0 ");
        if (n >= 1) System.out.print("1 ");
        
        long prev = 0, curr = 1;
        
        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            System.out.print(next + " ");
            prev = curr;
            curr = next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Test with different values
        int[] testCases = {10, 20};
        
        for (int n : testCases) {
            System.out.println("\nTesting for n = " + n);
            System.out.println("------------------------");
            
            // Time and print recursive series
            long startTime = System.nanoTime();
            printFibSeriesRecursive(n);
            long recursiveTime = System.nanoTime() - startTime;
            
            // Time and print iterative series
            startTime = System.nanoTime();
            printFibSeriesIterative(n);
            long iterativeTime = System.nanoTime() - startTime;
            
            // Print timing comparison
            System.out.println("\nTime taken:");
            System.out.printf("Recursive: %d ms%n", recursiveTime / 1_000_000);
            System.out.printf("Iterative: %d ms%n", iterativeTime / 1_000_000);
        }
    }
}