package mod5;

import java.util.List;
import java.util.concurrent.Flow.*;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.ForkJoinPool;

public class publisher{

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

    private static final List<String> parallelTimelines = List.of(
        "Alternate Universe 1: Big Bang", 
        "Alternate Universe 1: Formation of the Earth", 
        "Alternate Universe 2: Big Bang", 
        "Alternate Universe 2: Rise of Machines"
    );

    private static final SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

    public static void main(String[] args) {
        System.out.println("=== Reactive Communication Between Timelines ===");

        // Add a subscriber for reactive communication
        publisher.subscribe(new TimelineSubscriber());

        // Simulate sequential exploration
        simulateSequentialExploration();

        // Simulate parallel exploration
        simulateParallelExploration();

        // Close the publisher
        publisher.close();
    }

    // Simulate sequential exploration and publish events
    private static void simulateSequentialExploration() {
        System.out.println("\nSequential Exploration:");
        sequentialTimeline.forEach(event -> {
            System.out.println("Publishing (Sequential): " + event);
            publisher.submit("Sequential Timeline: " + event);
        });
    }

    // Simulate parallel exploration and publish events
    private static void simulateParallelExploration() {
        System.out.println("\nParallel Exploration:");
        ForkJoinPool.commonPool().submit(() -> {
            parallelTimelines.forEach(event -> {
                System.out.println("Publishing (Parallel): " + event);
                publisher.submit("Parallel Timeline: " + event);
            });
        }).join();
    }

    // Subscriber class to consume published events
    static class TimelineSubscriber implements Subscriber<String> {
        private Subscription subscription;

        @Override
        public void onSubscribe(Subscription subscription) {
            this.subscription = subscription;
            subscription.request(1); // Request the first item
        }

        @Override
        public void onNext(String item) {
            System.out.println("Subscriber received: " + item);
            subscription.request(1); // Request the next item
        }

        @Override
        public void onError(Throwable throwable) {
            System.err.println("Subscriber encountered an error: " + throwable.getMessage());
        }

        @Override
        public void onComplete() {
            System.out.println("Subscriber: All events processed.");
        }
    }
}
