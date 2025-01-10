import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandler{
    public static void main(String[] args) {
        String fileName = "sample.txt";
        
        try {
            readFromFile(fileName);
        } catch (FileNotFoundException e) {
            // Specific exception for file not found
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            // General IO exception for other file operations
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    private static void readFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        // The try-with-resources automatically closes the reader in all cases
    }
}