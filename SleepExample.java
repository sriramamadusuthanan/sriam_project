package problem1to10;
import java.lang.Thread;
class SleepExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + " - Count: " + i);

            try {
                // Sleep for 1 second (1000 milliseconds)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class SleepExampleDemo {
    public static void main(String[] args) {
        SleepExample thread1 = new SleepExample();
        SleepExample thread2 = new SleepExample();

        thread1.start();
        thread2.start();
    }
}
