import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RabinKarp {
    // Rabin-Karp search function
    public static int rabinKarpSearch(String pattern, String text, int prime) {
        int m = pattern.length();
        int n = text.length();
        int patternHash = 0; // Hash value for the pattern
        int textHash = 0;    // Hash value for the current substring of text
        int h = 1;
        int d = 256; // Number of characters in the input alphabet
        int comparisons = 0;

        // Calculate h = d^(m-1) % prime
        for (int i = 0; i < m - 1; i++) {
            h = (h * d) % prime;
        }

        // Calculate initial hash values for pattern and text
        for (int i = 0; i < m; i++) {
            patternHash = (d * patternHash + pattern.charAt(i)) % prime;
            textHash = (d * textHash + text.charAt(i)) % prime;
        }

        // Slide the pattern over text
        for (int i = 0; i <= n - m; i++) {
            // Check if hash values match
            if (patternHash == textHash) {
                // Verify characters to avoid hash collision
                int j;
                for (j = 0; j < m; j++) {
                    comparisons++;
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                }
                if (j == m) {
                    System.out.println("Pattern found at index " + i);
                    System.out.println("Total comparisons: " + comparisons);
                    return i;
                }
            }

            // Calculate the hash value for the next substring
            if (i < n - m) {
                textHash = (d * (textHash - text.charAt(i) * h) + text.charAt(i + m)) % prime;
                // Make sure the hash value is positive
                if (textHash < 0) {
                    textHash = (textHash + prime);
                }
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

            // Perform Rabin-Karp search
            System.out.println("Analyzing with Rabin-Karp Algorithm...");
            rabinKarpSearch(hiddenMessage, innocentText, 101); // Prime number for hash calculation
        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}
