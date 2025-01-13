package mod5;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class forkjoin{

    // Create a ForkJoinPool for managing parallel tasks
    private static final ForkJoinPool pool = new ForkJoinPool();

    // Timeline data for parallel exploration
    private static final List<String> parallelTimelines = List.of(
        "Alternate Universe 1: Big Bang",
        "Alternate Universe 1: Formation of the Earth",
        "Alternate Universe 2: Big Bang",
        "Alternate Universe 2: Rise of Machines"
    );

    public static void main(String[] args) {
        System.out.println("=== Initializing the Parallel Universe Explorer ===");

        // Initialize the Parallel Universe Explorer with RecursiveAction tasks
        RecursiveAction task = new ParallelTask(parallelTimelines, 0, parallelTimelines.size());
        pool.invoke(task); // Submit the task to the ForkJoinPool
    }

    // Implement RecursiveAction tasks for initializing the explorer
    static class ParallelTask extends RecursiveAction {
        private static final int THRESHOLD = 2; // Threshold for dividing tasks
        private final List<String> timelines;  // Data to process
        private final int start;               // Start index
        private final int end;                 // End index

        ParallelTask(List<String> timelines, int start, int end) {
            this.timelines = timelines;
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            // If the task is small enough, process it directly
            if (end - start <= THRESHOLD) {
                for (int i = start; i < end; i++) {
                    System.out.println("Exploring: " + timelines.get(i));
                }
            } else {
                // Otherwise, split the task into smaller subtasks
                int mid = (start + end) / 2;
                ParallelTask leftTask = new ParallelTask(timelines, start, mid);
                ParallelTask rightTask = new ParallelTask(timelines, mid, end);
                invokeAll(leftTask, rightTask); // Execute subtasks in parallel
            }
        }
    }
}
