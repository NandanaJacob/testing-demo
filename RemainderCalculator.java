// RemainderCalculator.java
public class RemainderCalculator {
    // Method 1: Using subtraction
    public static int findRemainderUsingSubtraction(int a, int b) {
        while (a >= b) {
            a = a - b;
        }
        return a;
    }
    
    // Method 2: Using division and multiplication
    public static int findRemainderUsingDivision(int a, int b) {
        int quotient = a / b;
        return a - (b * quotient);
    }
    
    public static void main(String[] args) {
        // Initialize variables
        int a = 10;
        int b = 3;
        
        System.out.println("Finding remainder for " + a + " ÷ " + b);
        
        // Method 1: Using repeated subtraction
        int remainder1 = findRemainderUsingSubtraction(a, b);
        System.out.println("\nMethod 1 (Using Subtraction):");
        System.out.println("Remainder = " + remainder1);
        
        // Method 2: Using division and multiplication
        int remainder2 = findRemainderUsingDivision(a, b);
        System.out.println("\nMethod 2 (Using Division and Multiplication):");
        System.out.println("Remainder = " + remainder2);
        
        // Verification steps
        System.out.println("\nVerification:");
        System.out.println("Original number (a) = " + a);
        System.out.println("Divisor (b) = " + b);
        int quotient = a / b;
        System.out.println("Quotient (a ÷ b) = " + quotient);
        System.out.println("Remainder = " + remainder1);
        System.out.println("Check: " + b + " × " + quotient + " + " + remainder1 + " = " + (b * quotient + remainder1));
    }
}