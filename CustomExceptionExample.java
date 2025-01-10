// Main class to demonstrate DataProcessor functionality
public class CustomExceptionExample{
    public static void main(String[] args) {
        DataProcessor dataProcessor = new DataProcessor(); // Create DataProcessor instance

        // Test with a valid array
        int[] numbers = {10, 20, 30, 40, 50}; // Valid input
        try {
            double average = dataProcessor.processData(numbers); // Calculate average
            System.out.println("Average: " + average); // Print the average
        } catch (InvalidDataException e) {
            System.err.println("Error: " + e.getMessage()); // Print error message
        }

        // Test with an empty array
        int[] emptyArray = {}; // Empty input
        try {
            double average = dataProcessor.processData(emptyArray); // Attempt to calculate average
            System.out.println("Average: " + average); // Print the average
        } catch (InvalidDataException e) {
            System.err.println("Error: " + e.getMessage()); // Print error message
        }

        // Test with a null array
        int[] nullArray = null; // Null input
        try {
            double average = dataProcessor.processData(nullArray); // Attempt to calculate average
            System.out.println("Average: " + average); // Print the average
        } catch (InvalidDataException e) {
            System.err.println("Error: " + e.getMessage()); // Print error message
        }
    }
}
