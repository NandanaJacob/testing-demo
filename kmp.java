import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class kmp{
    // KMP search function
    public static int KMPSearch(String pattern, String text) {
        int m = pattern.length();
        int n = text.length();

        // Create LPS array
        int[] lps = computeLPSArray(pattern, m);

        int i = 0; // index for text
        int j = 0; // index for pattern
        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                System.out.println("Pattern found at index " + (i - j));
                return i - j;
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        System.out.println("Pattern not found.");
        return -1;
    }

    // Preprocess the pattern to compute the LPS array
    public static int[] computeLPSArray(String pattern, int m) {
        int[] lps = new int[m];
        int length = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    // Read file content as a String
    public static String readFileAsString(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    public static void main(String[] args) {
        try {
            // Read files
            String innocentText = readFileAsString("innocent_text.txt");
            String hiddenMessage = readFileAsString("message_to_find.txt");

            // Analyze using KMP
            System.out.println("Analyzing with KMP...");
            KMPSearch(hiddenMessage, innocentText);
        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}
