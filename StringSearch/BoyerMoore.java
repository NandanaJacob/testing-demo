package StringSearch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BoyerMoore {
    // Function to create the Bad Character Table
    private static int[] createBadCharTable(String pattern) {
        int[] badCharTable = new int[256]; // ASCII character set
        int m = pattern.length();

        // Initialize all positions to -1
        for (int i = 0; i < 256; i++) {
            badCharTable[i] = -1;
        }

        // Fill in the last occurrence of each character in the pattern
        for (int i = 0; i < m; i++) {
            badCharTable[pattern.charAt(i)] = i;
        }

        return badCharTable;
    }

    // Boyer-Moore search function
    public static int boyerMooreSearch(String pattern, String text) {
        int[] badCharTable = createBadCharTable(pattern);
        int m = pattern.length();
        int n = text.length();
        int comparisons = 0;

        int shift = 0; // Shift of the pattern over the text
        while (shift <= n - m) {
            int j = m - 1;

            // Compare the pattern with text from the end of the pattern
            while (j >= 0 && pattern.charAt(j) == text.charAt(shift + j)) {
                j--;
                comparisons++;
            }

            // If the pattern is found
            if (j < 0) {
                System.out.println("Pattern found at index " + shift);
                System.out.println("Total comparisons: " + comparisons);
                return shift;
            } else {
                comparisons++;
                // Use the Bad Character Rule to calculate the shift
                int badCharShift = Math.max(1, j - badCharTable[text.charAt(shift + j)]);
                shift += badCharShift;
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

            // Perform Boyer-Moore search
            System.out.println("Analyzing with Boyer-Moore Algorithm...");
            boyerMooreSearch(hiddenMessage, innocentText);
        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}
