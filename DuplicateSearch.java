import java.util.HashSet;

public class DuplicateSearch {

    public static void main(String[] args) {
        // Step 1: Declare and initialize an array
        int[] numbers = {3, 5, 7, 3, 8, 5};

        // Step 2: Call the function to find duplicates
        findDuplicates(numbers);
    }

    // Function to find duplicates
    public static void findDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        boolean hasDuplicates = false;

        System.out.println("Searching for duplicates...");
        for (int num : array) {
            if (seen.contains(num)) {
                System.out.println("Duplicate found: " + num);
                hasDuplicates = true;
            } else {
                seen.add(num);
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
    }
}
