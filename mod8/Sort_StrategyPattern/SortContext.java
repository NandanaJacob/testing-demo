package mod8.Sort_StrategyPattern;

public class SortContext {
    private SortStrategy sortStrategy; 

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    // Perform sorting using the current strategy
    public void sort(int[] array) {
        if (sortStrategy == null) {
            System.out.println("No sorting strategy selected.");
            return;
        }
        sortStrategy.sort(array);
    }
}

