package problem1to10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Insert elements into the queue (enqueue)
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue after enqueuing elements:");
        displayQueue(queue);

        // Remove elements from the queue (dequeue)
        int dequeuedElement = queue.poll();
        System.out.println("\nDequeued element: " + dequeuedElement);

        System.out.println("Queue after dequeuing an element:");
        displayQueue(queue);

        // Peek (view) the front element without removing it
        int frontElement = queue.peek();
        System.out.println("\nFront element (without removal): " + frontElement);

        // Insert another element into the queue
        queue.add(40);

        System.out.println("\nQueue after enqueuing another element:");
        displayQueue(queue);
    }

    // Method to display the elements of the queue
    private static void displayQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

