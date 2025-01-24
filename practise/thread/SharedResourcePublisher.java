package practise.thread;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.SubmissionPublisher;

public class SharedResourcePublisher {
    private static final List<String> sequentialTimeline = List.of("event1", "event2", "event3");
    private static final List<String> parallelTimeline = List.of("altEvent1", "altEvent2", "altEvent3");
    private static final SubmissionPublisher publisher = new SubmissionPublisher<>();
    private static final ForkJoinPool pool = new ForkJoinPool();
    private static final Object sharedResource = new Object();

    static class HandleEvents extends RecursiveAction{
        List<String> timeline;
        //boolean ready = true;
        
        public HandleEvents(List<String> timeline) {
            this.timeline = timeline;
        }

        @Override
        protected void compute() {
            for (String event : timeline) {
                synchronized (sharedResource) {
                    try {
                        System.out.println("exploring: " + event);
                        publisher.submit("published: " + event);
                        
                        // Optional: brief pause to simulate processing
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                        Thread.currentThread().interrupt();
                    }
                }
            
            }
        }
    }
    public static void main(String[] args) {
        HandleEvents Sequential = new HandleEvents(sequentialTimeline);
        HandleEvents Parallel = new HandleEvents(parallelTimeline);
        pool.invoke(Sequential);
        pool.invoke(Parallel);
        pool.shutdown();
        publisher.close();
    }
}
