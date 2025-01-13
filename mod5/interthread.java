package mod5;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class interthread{

    private static final List<String> sequentialTimeline = List.of(
        "Big Bang",
        "Formation of the Earth",
        "First Life on Earth",
        "Dinosaur Era",
        "Extinction of Dinosaurs",
        "Rise of Mammals",
        "Humans Emerge"
    );

    private static final List<String> parallelTimelines = List.of(
        "Alternate Universe 1: Big Bang",
        "Alternate Universe 1: Formation of the Earth",
        "Alternate Universe 2: Big Bang",
        "Alternate Universe 2: Rise of Machines"
    );

    private static final ForkJoinPool pool = new ForkJoinPool();
    private static final Object sharedResource = new Object(); // Shared resource for synchronization
    private static boolean isResourceInUse = false; // Flag for resource state

    public static void main(String[] args) {
        System.out.println("=== Parallel Universe Explorer ===");

        // Simulate sequential exploration
        simulateSequentialExploration();

        // Simulate parallel exploration
        simulateParallelExploration();

        // Synchronize access to shared resources
        introduceThreadSynchronization();
    }

    private static void simulateSequentialExploration() {
        System.out.println("\nSequential Exploration:");
        sequentialTimeline.forEach(event -> System.out.println("Sequentially exploring: " + event));
    }

    private static void simulateParallelExploration() {
        System.out.println("\nParallel Exploration:");
        RecursiveAction task = new ParallelTask(parallelTimelines, 0, parallelTimelines.size());
        pool.invoke(task);
    }

    static class ParallelTask extends RecursiveAction {
        private static final int THRESHOLD = 2;
        private final List<String> timelines;
        private final int start;
        private final int end;

        ParallelTask(List<String> timelines, int start, int end) {
            this.timelines = timelines;
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            if (end - start <= THRESHOLD) {
                for (int i = start; i < end; i++) {
                    System.out.println("Parallelly exploring: " + timelines.get(i));
                }
            } else {
                int mid = (start + end) / 2;
                ParallelTask leftTask = new ParallelTask(timelines, start, mid);
                ParallelTask rightTask = new ParallelTask(timelines, mid, end);
                invokeAll(leftTask, rightTask);
            }
        }
    }

    private static void introduceThreadSynchronization() {
        System.out.println("\nSynchronizing Access to Shared Resources:");

        Thread task1 = new Thread(() -> useSharedResource("Task 1"));
        Thread task2 = new Thread(() -> useSharedResource("Task 2"));

        task1.start();
        task2.start();

        try {
            task1.join();
            task2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static void useSharedResource(String taskName) {
        synchronized (sharedResource) {
            while (isResourceInUse) {
                try {
                    System.out.println(taskName + " is waiting for the resource...");
                    sharedResource.wait(); // Wait for the resource to be available
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            // Use the resource
            isResourceInUse = true;
            System.out.println(taskName + " is using the resource...");
            Thread.onSpinWait(); // Simulate work

            // Release the resource
            isResourceInUse = false;
            sharedResource.notify(); // Notify other threads
            System.out.println(taskName + " has released the resource.");
        }
    }
}
