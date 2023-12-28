package problem1to10;
import java.lang.Thread;

//Extend the Thread class
class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getId() + " Value " + i);
     }
 }
}

class ThreadExampleUsingThreadClass {
 public static void main(String args[]) {
     // Create two instances of MyThread
     MyThread thread1 = new MyThread();
     MyThread thread2 = new MyThread();

     // Start the threads
     thread1.start();
     thread2.start();
 }
}


