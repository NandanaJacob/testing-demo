import java.util.concurrent.CountDownLatch;

class MyThread extends Thread {
    private final CountDownLatch currentLatch;
    private final CountDownLatch nextLatch;

    public MyThread(String name, CountDownLatch currentLatch, CountDownLatch nextLatch) {
        super(name);
        this.currentLatch = currentLatch;
        this.nextLatch = nextLatch;
    }

    public void run() {
        try {
            currentLatch.await(); // Wait until the current latch is counted down
            System.out.println(getName() + " is running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (nextLatch != null) {
                nextLatch.countDown(); // Signal the next thread to proceed
            }
        }
    }
}

public class CountdownLatchExample {
    public static void main(String[] args) {
        CountDownLatch latch1 = new CountDownLatch(1); // Latch for t1
        CountDownLatch latch2 = new CountDownLatch(1); // Latch for t2
        CountDownLatch latch3 = new CountDownLatch(1); // Latch for t3

        MyThread t1 = new MyThread("Thread-1", new CountDownLatch(0), latch1);
        MyThread t2 = new MyThread("Thread-2", latch1, latch2);
        MyThread t3 = new MyThread("Thread-3", latch2, null);

        t1.start(); // Start t1
        t2.start(); // Start t2
        t3.start(); // Start t3
    }
}
