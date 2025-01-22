package practise.thread;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
public class seqStreams {
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
    public static void main(String[] args) {
        System.out.println("******* Sequential Execution ******");
        SequentialExecution();
        System.out.println("******* Parallel Execution ******");
        ParallelExecution();
    }
    public static void SequentialExecution(){
        sequentialTimeline.stream().forEach(event -> System.out.println("HP:" + event));
    }
    public static void ParallelExecution(){
        TimelineTask task = new TimelineTask(sequentialTimeline, 0, sequentialTimeline.size());
        pool.invoke(task);
    }
    static class TimelineTask extends RecursiveAction{
        int start;
        int end;
        int mid;
        int THRESHOLD = 2;
        List<String> timeline;
        public TimelineTask(List<String> timeline, int start, int end) {
            this.start = start;
            this.end = end;
            this.timeline = timeline;
        }
        @Override
        protected void compute(){
            if(end-start <= THRESHOLD){
                for(int i=start; i<end; i++){
                    System.out.println("Harry Potter and " + sequentialTimeline.get(i));
                }
            }
            else{
                mid = (start+end)/2;
                TimelineTask leftTask = new TimelineTask(sequentialTimeline, start, mid);
                TimelineTask rightTask = new TimelineTask(sequentialTimeline, mid, end);
                invokeAll(leftTask, rightTask);
            }
        }
    }
}
