public class LongestCommonSubsequence {
    
    // Class to store both the length and the LCS string
    static class LCSResult {
        int length;
        String sequence;
        
        LCSResult(int length, String sequence) {
            this.length = length;
            this.sequence = sequence;
        }
    }
    
    public static LCSResult findLCS(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        
        // Create DP table
        int[][] dp = new int[m + 1][n + 1];
        
        // Fill the DP table
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        // Reconstruct the LCS string
        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                lcs.insert(0, str1.charAt(i - 1));
                i--;
                j--;
            }
            else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            }
            else {
                j--;
            }
        }
        
        return new LCSResult(dp[m][n], lcs.toString());
    }
    
    // Print the DP table for visualization
    public static void printDPTable(String str1, String str2, int[][] dp) {
        System.out.println("\nDP Table:");
        System.out.print("    ");
        System.out.print("  ");
        for (char c : str2.toCharArray()) {
            System.out.print(c + "  ");
        }
        System.out.println();
        
        for (int i = 0; i <= str1.length(); i++) {
            if (i == 0) {
                System.out.print("  ");
            } else {
                System.out.print(str1.charAt(i - 1) + " ");
            }
            for (int j = 0; j <= str2.length(); j++) {
                System.out.printf("%-3d", dp[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // Test cases
        String[][] testCases = {
            {"ABCDGH", "AEDFHR"},
            {"AGGTAB", "GXTXAYB"},
            {"PROGRAMMING", "GAMING"},
            {"HELLO", "WORLD"}
        };
        
        for (String[] test : testCases) {
            String str1 = test[0];
            String str2 = test[1];
            
            System.out.println("\nString 1: " + str1);
            System.out.println("String 2: " + str2);
            
            LCSResult result = findLCS(str1, str2);
            
            System.out.println("Length of LCS: " + result.length);
            System.out.println("Longest Common Subsequence: " + result.sequence);
        }
    }
}