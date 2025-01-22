package practise;
// You are provided with a program skeleton that involves a custom exception class. Your task is to
// complete the program by adding the necessary exception handling code to catch and handle the
// CustomException that may be thrown based on a specific condition.


class CustomException extends Exception {
    String message;
    public CustomException(String message) {
        super(message);
    }
    // Add any additional customizations if needed
}
   
public class CustomExceptionDemo{
    public static void main(String[] args) {
        int userInput = -5;
        try {
            validateInput(userInput);
        } catch (CustomException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
    private static void validateInput(int input) throws CustomException {
        if (input < 0) {
            throw new CustomException("Input cannot be negative");
        }
    }
}