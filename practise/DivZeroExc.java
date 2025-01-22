package practise;
// You are provided with a program skeleton that performs a division operation. However, there is a
// possibility of encountering a DivideByZeroException. Your task is to complete the program by adding
// the necessary exception-handling code to catch and handle this exception gracefully.


public class DivZeroExc {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        // TODO: Implement exception handling for divide by zero
        try{
            int result = divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);
        }catch(ArithmeticException e){
            System.out.println("divide by zero: handled in main");
        }
    }
    private static int divideNumbers(int numerator, int denominator) {
        // TODO: Implement exception handling for divide by zero
        try{
            return numerator / denominator;
        }catch(ArithmeticException e){
            System.out.println("divide by zero (inside function)");
            return 0;
        }
    }
}