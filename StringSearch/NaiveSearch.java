package StringSearch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NaiveSearch {
    // Naive Search function
    public static int naiveSearch(String pattern, String text) {
        int m = pattern.length();
        int n = text.length();
        int comparisons = 0;

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                comparisons++; // Count each character comparison
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            // If the pattern is found
            if (j == m) {
                System.out.println("Pattern found at index " + i);
                System.out.println("Total comparisons: " + comparisons);
                return i;
            }
        }

        System.out.println("Pattern not found.");
        System.out.println("Total comparisons: " + comparisons);
        return -1;
    }

    // Read file content as a String
    public static String readFileAsString(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    public static void main(String[] args) {
        try {
            // Read the text and pattern from files
            String innocentText = readFileAsString("innocent_text.txt");
            String hiddenMessage = readFileAsString("message_to_find.txt");

            // Perform Naive Search
            System.out.println("Analyzing with Naive Search...");
            naiveSearch(hiddenMessage, innocentText);
        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}
