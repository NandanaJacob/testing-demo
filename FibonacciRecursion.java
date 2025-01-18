public class FibonacciRecursion {

    // Recursive method to find Fibonacci numbers
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("Fibonacci sequence up to " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
