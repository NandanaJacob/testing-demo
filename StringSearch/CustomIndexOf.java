package StringSearch;

public class CustomIndexOf {

    public static void main(String[] args) {
        String text = "hello world";
        char targetChar = 'o';
        String targetSubstring = "world";

        // Find index of a character
        int charIndex = indexOf(text, targetChar);
        System.out.println("Index of character '" + targetChar + "': " + charIndex);

        // Find index of a substring
        int substringIndex = indexOf(text, targetSubstring);
        System.out.println("Index of substring \"" + targetSubstring + "\": " + substringIndex);
    }

    // Custom indexOf function for a character
    public static int indexOf(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }
        return -1; // Return -1 if the character is not found
    }

    // Custom indexOf function for a substring
    public static int indexOf(String str, String substr) {
        int n = str.length();
        int m = substr.length();

        if (m > n) return -1; // Substring longer than string

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (str.charAt(i + j) != substr.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i; // Substring found
            }
        }
        return -1; // Return -1 if the substring is not found
    }
}
