import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array
        int[] numbers = new int[size];

        // Get the elements of the array from the user1
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize largest and smallest with the first element of the array
        int largest = numbers[0];
        int smallest = numbers[0];

        // Iterate through the array to find the largest and smallest elements
        for (int i = 1; i < size; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i]; // Update largest
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i]; // Update smallest
            }
        }

        // Display the results
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        // Close the scanner
        scanner.close();
    }
}
