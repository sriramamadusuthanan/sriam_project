package problem1to10;

class Node1 {
    int data;
    Node next;

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    // Method to insert a new element in a sorted circular linked list
    public void insertSorted(int newData) {
        Node newNode = new Node(newData);

        // If the list is empty, insert the new node as the only node
        if (head == null) {
            head = newNode;
            head.next = head; // circular reference
        } else if (newData <= head.data) {
            // If the new data is less than or equal to the head data, insert at the beginning
            newNode.next = head;
            head = newNode;
        } else {
            // Traverse the list to find the appropriate position to insert the new node
            Node current = head;
            while (current.next != head && current.next.data < newData) {
                current = current.next;
            }

            // Insert the new node in the middle or at the end
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Method to display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class InsertSortedCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList circularList = new CircularLinkedList();

        // Insert elements into the sorted circular linked list
        circularList.insertSorted(10);
        circularList.insertSorted(20);
        circularList.insertSorted(30);
        circularList.insertSorted(40);
        circularList.insertSorted(25);

        System.out.println("Circular Linked List after insertion:");
        circularList.display();
    }
}

