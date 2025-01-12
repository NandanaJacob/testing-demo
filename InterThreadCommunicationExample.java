class SharedResource {
    private int data;
    private boolean isDataAvailable = false;

    // Method for Producer to produce data
    public synchronized void produce(int value) {
        try {
            while (isDataAvailable) {
                wait(); // Wait if data is not yet consumed
            }
            data = value;
            System.out.println("Produced: " + data);
            isDataAvailable = true;
            notify(); // Notify the Consumer thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method for Consumer to consume data
    public synchronized void consume() {
        try {
            while (!isDataAvailable) {
                wait(); // Wait if no data is available
            }
            System.out.println("Consumed: " + data);
            isDataAvailable = false;
            notify(); // Notify the Producer thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Named class for Producer task
class ProducerTask implements Runnable {
    private SharedResource resource;

    public ProducerTask(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
        }
    }
}

// Named class for Consumer task
class ConsumerTask implements Runnable {
    private SharedResource resource;

    public ConsumerTask(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
        }
    }
}

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Producer thread
        Thread producer = new Thread(new ProducerTask(resource));

        // Consumer thread
        Thread consumer = new Thread(new ConsumerTask(resource));

        producer.start();
        consumer.start();
    }
}

// Inter-thread communication in Java refers to the mechanism that allows threads to 
// communicate and coordinate with each other during execution. 

// This is particularly important in scenarios where one thread depends on the state or 

// result of another thread.
// Java provides methods like 
// wait()
// notify()
// notifyAll() 
// from the Object class to facilitate communication between threads. 
// These methods must be used within a synchronized block or method.