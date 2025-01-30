package mod8.Sort_StrategyPattern;

public class SortMain {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 6, 2};

        // Create context for sorting
        SortContext context = new SortContext();

        context.setSortStrategy(new BubbleSort());
        context.sort(array);
        printArray(array);

        context.setSortStrategy(new MergeSort());
        context.sort(array);
        printArray(array);

        context.setSortStrategy(new QuickSort());
        context.sort(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
