package practise.thread;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class ReactiveStreamsEx {
    //create SubmissionPublisher ka object publisher
    private static final ForkJoinPool pool = new ForkJoinPool();
    private static final List<String> sequentialTimeline = List.of(
        "Sorcerer's Stone",
        "Chamber of Secrets",
        "Prisoner of Azkaban",
        "Goblet of Fire",
        "Order of Pheonix",
        "Half Blood Prince",
        "Deathly Hallows"
    );
    private static final List<String> parallelTimeline = List.of(
        "Hunger Games",
        "Catching Fire",
        "Mockingjay"
    );
    private static final SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
    public static void main(String[] args) {
        //create subscrition
        publisher.subscribe(new TimelineSubscriber());
        System.out.println("****** Sequential *******");
        SequentialExecution();
        System.out.println("******* Parallel *******");
        ParallelExecution();
        publisher.close();
    }
    public static void SequentialExecution(){
        sequentialTimeline.forEach(book -> {
            System.out.println("Sequential published: " + book);
            publisher.submit("Sequential: " + book);
        });
    }
    public static void ParallelExecution(){
        pool.commonPool().submit(() -> {
            parallelTimeline.forEach(book -> {
                System.out.println("Parallel published: " + book);
                publisher.submit("Parallel: " + book);
            });
        }).join();
    }
    static class TimelineSubscriber implements Subscriber<String>{
        private Subscription subscription;
        @Override
        public void onSubscribe(Subscription subscription) {
            this.subscription = subscription;
            subscription.request(1);
        }
        @Override
        public void onNext(String timeline){
            System.out.println("subscriber got : " + timeline);
            subscription.request(1);
        }
        @Override
        public void onError(Throwable throwable){
            System.out.println("Error! " + throwable.getMessage());
        }
        @Override
        public void onComplete(){
            System.out.println("All books complete");
        }
        
    }
}
