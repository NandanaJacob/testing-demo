// Swapper.java
public class Swapper {
    // Static generic method to swap values
    public static <T> void doSwap(T a, T b) {
        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        // Swapping using a temporary variable
        T temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        // Test with Integers
        System.out.println("Swapping Integers:");
        doSwap(10, 20);

        // Test with Strings
        System.out.println("\nSwapping Strings:");
        doSwap("Hello", "World");

        // Test with Doubles
        System.out.println("\nSwapping Doubles:");
        doSwap(1.5, 2.5);
    }
}

