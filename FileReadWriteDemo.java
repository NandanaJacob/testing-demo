import java.io.*;

public class FileReadWriteDemo {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "Hello, this is a simple file read/write demo.";

        // Write to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Content written to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Reading from file: " + fileName);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
