// Class to process data and calculate the average
public class DataProcessor {
    // Method to process data and calculate the average
    public double processData(int[] data) throws InvalidDataException {
        // Check if the array is null or empty
        if (data == null || data.length == 0) {
            throw new InvalidDataException("Array is null or empty."); // Throw custom exception
        }

        // Calculate the average
        double sum = 0;
        for (int num : data) {
            sum += num; // Add each number to the sum
        }
        return sum / data.length; // Return the average
    }
}
