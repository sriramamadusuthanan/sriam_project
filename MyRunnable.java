package problem1to10;
import java.lang.Thread;
import java.lang.Runnable;
//This file contains the public class ThreadExampleUsingRunnableInterface
class MyRunnable implements Runnable {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(Thread.currentThread().getId() + " Value " + i);
     }
 }
}

class ThreadExampleUsingRunnableInterface {
 public static void main(String args[]) {
     MyRunnable myRunnable = new MyRunnable();
     Thread thread1 = new Thread(myRunnable);
     Thread thread2 = new Thread(myRunnable);

     thread1.start();
     thread2.start();
 }
}

