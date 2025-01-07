import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedUncheckedExc{

    public static void main(String[] args) {
        // Handling unchecked exception
        try {
            // Unchecked exception: ArithmeticException
            int a = 10;
            int b = 0; // This will cause a division by zero
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Caught an unchecked exception: " + e.getMessage());
        }

        // Handling checked exception
        try {
            // Checked exception: IOException
            readFile("non_existent_file.txt");
        } catch (IOException e) {
            System.out.println("Caught a checked exception: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }

    // Method that may throw a checked exception
    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();
        System.out.println("File content: " + line);
        reader.close();
    }
}
