package mod5;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ParallelUniverseExplorer {

    // Simulated timeline data
    private static final List<String> sequentialTimeline = List.of(
        "Big Bang",
        "Formation of the Earth",
        "First Life on Earth",
        "Dinosaur Era",
        "Extinction of Dinosaurs",
        "Rise of Mammals",
        "Humans Emerge"
    );

    // ForkJoinPool for parallel processing
    private static final ForkJoinPool pool = new ForkJoinPool();

    public static void main(String[] args) {
        System.out.println("=== Sequential Exploration ===");
        sequentialExploreTimeline();

        System.out.println("\n=== Parallel Exploration Using ForkJoinPool ===");
        parallelExploreTimeline();
    }

    // Sequential exploration using streams
    private static void sequentialExploreTimeline() {
        sequentialTimeline.stream()
                          .forEach(event -> System.out.println("Exploring: " + event));
    }

    // Parallel exploration using RecursiveAction and ForkJoinPool
    private static void parallelExploreTimeline() {
        // Create a RecursiveAction task for the entire timeline
        TimelineTask task = new TimelineTask(sequentialTimeline, 0, sequentialTimeline.size());
        pool.invoke(task); // Use ForkJoinPool to execute the task
    }

    // Custom RecursiveAction to handle parallel timeline exploration
    static class TimelineTask extends RecursiveAction {
        private static final int THRESHOLD = 2; // Minimum size for splitting tasks
        private final List<String> timeline;
        private final int start;
        private final int end;

        // Constructor to initialize the task
        public TimelineTask(List<String> timeline, int start, int end) {
            this.timeline = timeline;
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            // If the task is small enough, process it directly
            if (end - start <= THRESHOLD) {
                for (int i = start; i < end; i++) {
                    System.out.println("Exploring: " + timeline.get(i));
                }
            } else {
                // Split the task into two subtasks
                int mid = (start + end) / 2;
                TimelineTask leftTask = new TimelineTask(timeline, start, mid);
                TimelineTask rightTask = new TimelineTask(timeline, mid, end);

                // Invoke the subtasks in parallel
                invokeAll(leftTask, rightTask);
            }
        }
    }
}
