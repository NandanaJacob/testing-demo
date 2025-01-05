import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number for the Fibonacci series: ");
        int maxNumber = scanner.nextInt();

        // Initialize the first two Fibonacci numbers
        int a = 0; // First number
        int b = 1; // Second number

        System.out.println("Fibonacci Series up to " + maxNumber + ":");

        while (a <= maxNumber) {
            System.out.print(a + " "); // Print the current number
            int next = a + b; // Calculate the next Fibonacci number
            a = b; // Update a to the next number
            b = next; // Update b to the next number
        }

        scanner.close();
    }
}
