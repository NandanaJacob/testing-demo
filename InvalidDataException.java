// Custom exception class for invalid data
public class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message); // Pass the message to the superclass (Exception)
    }
}
