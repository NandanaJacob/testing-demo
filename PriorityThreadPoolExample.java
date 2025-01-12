import java.util.concurrent.*;

class MyTask implements Runnable {
    private final int priority;

    public MyTask(int priority) {
        this.priority = priority;
    }

    @Override
    public void run() {
        System.out.println("Task with priority " + priority + " is running");
    }
}

public class PriorityThreadPoolExample {
    public static void main(String[] args) {
        PriorityBlockingQueue<Runnable> queue = new PriorityBlockingQueue<>(10, (r1, r2) -> {
            MyTask t1 = (MyTask) r1;
            MyTask t2 = (MyTask) r2;
            //int a = Thread.getPriority();
            return Integer.compare(t2.java.lang.Thread.getpriority(), t1.priority); // Higher priority first
        });

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, queue);

        executor.execute(new MyTask(1)); // Lowest priority
        executor.execute(new MyTask(3)); // Highest priority
        executor.execute(new MyTask(2)); // Medium priority

        executor.shutdown();
    }
}
