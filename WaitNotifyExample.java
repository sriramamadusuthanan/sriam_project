package problem1to10;
import java.lang.Thread;
public class WaitNotifyExample {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread running...");

            // Release the lock and wait for a notification
            wait();

            System.out.println("Resumed.");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(1000); // Simulating some work
        synchronized (this) {
            System.out.println("Consumer thread running...");

            // Notify the waiting thread to resume
            notify();
        }
    }
}

class WaitNotifyExampleDemo {
    public static void main(String[] args) {
        final WaitNotifyExample example = new WaitNotifyExample();

        Thread producerThread = new Thread(() -> {
            try {
                example.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                example.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

