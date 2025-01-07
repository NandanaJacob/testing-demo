// TypeCastingDemo.java
public class testing {
    public static void main(String[] args) {
        // Example 1: Simple integer to float conversion
        int number1 = 100;
        float floatNumber1 = number1;  // Implicit casting (widening)
        System.out.println("Example 1 - Simple Conversion:");
        System.out.println("Integer Value: " + number1);
        System.out.println("Float Value: " + floatNumber1);
        
        // Example 2: Explicit casting
        int number2 = 500;
        float floatNumber2 = (float) number2;  // Explicit casting (though not necessary)
        System.out.println("\nExample 2 - Explicit Casting:");
        System.out.println("Integer Value: " + number2);
        System.out.println("Float Value: " + floatNumber2);
        
        // Example 3: Large number conversion
        int largeNumber = 1234567;
        float floatLarge = largeNumber;
        System.out.println("\nExample 3 - Large Number:");
        System.out.println("Integer Value: " + largeNumber);
        System.out.println("Float Value: " + floatLarge);
        
        // Example 4: Arithmetic operation with type casting
        int num1 = 10;
        int num2 = 3;
        float division = (float) num1 / num2;  // Cast to get decimal result
        System.out.println("\nExample 4 - Division with Casting:");
        System.out.println(num1 + " divided by " + num2 + " = " + division);
        
        // Example 5: Demonstrating precision
        int preciseNumber = 123456789;
        float floatPrecise = preciseNumber;
        System.out.println("\nExample 5 - Precision Demonstration:");
        System.out.println("Integer Value: " + preciseNumber);
        System.out.println("Float Value: " + floatPrecise);
        System.out.println("Note: Some precision might be lost due to float's limitations");
    }
}