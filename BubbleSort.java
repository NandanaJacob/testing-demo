import java.util.Scanner;

public class BubbleSort {

    // Bubble sort function
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparisons
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap adjacent elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Input the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array using bubble sort
        bubbleSort(array);

        // Display the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
