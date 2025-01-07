// ArraySortingDemo.java
import java.util.Arrays;
import java.util.Comparator;

// Custom class demonstrating toString() override with multiple data types
class DataContainer implements Comparable<DataContainer> {
    private int intValue;
    private double doubleValue;
    private char charValue;
    private boolean boolValue;
    private float floatValue;
    
    public DataContainer(int i, double d, char c, boolean b, float f) {
        this.intValue = i;
        this.doubleValue = d;
        this.charValue = c;
        this.boolValue = b;
        this.floatValue = f;
    }
    
    // Override toString() to provide custom string representation
    @Override
    public String toString() {
        return String.format("DataContainer[int=%d, double=%.2f, char=%c, bool=%b, float=%.2f]",
                           intValue, doubleValue, charValue, boolValue, floatValue);
    }
    
    // Implement compareTo for natural ordering (based on intValue)
    @Override
    public int compareTo(DataContainer other) {
        return Integer.compare(this.intValue, other.intValue);
    }
    
    // Getter methods
    public int getIntValue() { return intValue; }
    public double getDoubleValue() { return doubleValue; }
    public char getCharValue() { return charValue; }
    public boolean getBoolValue() { return boolValue; }
    public float getFloatValue() { return floatValue; }
}

public class ArraySortingDemo {
    public static void main(String[] args) {
        // Demonstrate sorting of primitive arrays
        System.out.println("=== Sorting Primitive Arrays ===");
        
        // Integer array
        int[] intArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Int Array: " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("Sorted Int Array: " + Arrays.toString(intArray));
        
        // Double array
        double[] doubleArray = {3.14, 1.41, 2.71, 0.58, 1.73};
        System.out.println("\nOriginal Double Array: " + Arrays.toString(doubleArray));
        Arrays.sort(doubleArray);
        System.out.println("Sorted Double Array: " + Arrays.toString(doubleArray));
        
        // Char array
        char[] charArray = {'J', 'A', 'V', 'A', 'P', 'R', 'O', 'G'};
        System.out.println("\nOriginal Char Array: " + Arrays.toString(charArray));
        Arrays.sort(charArray);
        System.out.println("Sorted Char Array: " + Arrays.toString(charArray));
        
        // Float array
        float[] floatArray = {4.2f, 1.5f, 3.7f, 2.1f, 5.8f};
        System.out.println("\nOriginal Float Array: " + Arrays.toString(floatArray));
        Arrays.sort(floatArray);
        System.out.println("Sorted Float Array: " + Arrays.toString(floatArray));
        
        // Demonstrate custom class with toString() override
        System.out.println("\n=== Custom Class Array with toString() Override ===");
        DataContainer[] dataArray = {
            new DataContainer(5, 3.14, 'A', true, 2.5f),
            new DataContainer(2, 2.71, 'B', false, 1.5f),
            new DataContainer(8, 1.41, 'C', true, 3.7f),
            new DataContainer(1, 0.58, 'D', false, 4.2f)
        };
        
        System.out.println("Original Array:");
        printArray(dataArray);
        
        // Sort by natural ordering (intValue)
        Arrays.sort(dataArray);
        System.out.println("\nSorted by intValue:");
        printArray(dataArray);
        
        // Sort by doubleValue using custom comparator
        Arrays.sort(dataArray, Comparator.comparingDouble(DataContainer::getDoubleValue));
        System.out.println("\nSorted by doubleValue:");
        printArray(dataArray);
        
        // Sort by charValue using custom comparator
        Arrays.sort(dataArray, Comparator.comparing(DataContainer::getCharValue));
        System.out.println("\nSorted by charValue:");
        printArray(dataArray);
        
        // Sort by floatValue using custom comparator
        Arrays.sort(dataArray, Comparator.comparingDouble(DataContainer::getFloatValue));
        System.out.println("\nSorted by floatValue:");
        printArray(dataArray);
    }
    
    // Helper method to print arrays
    private static void printArray(DataContainer[] arr) {
        for (DataContainer data : arr) {
            System.out.println(data);
        }
    }
}