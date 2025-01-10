// Custom Exception class that extends Exception
class CustomException extends Exception {
    // Constructor that takes an error message
    public CustomException(String message) {
        super(message);  // Pass message to parent Exception class
    }
}

public class CustomExceptionAssignment{
    public static void main(String[] args) {
        int userInput = -5;
        
        try {
            validateInput(userInput);
            System.out.println("Input is valid: " + userInput);
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