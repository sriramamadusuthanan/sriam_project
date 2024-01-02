package problem1to10;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to delete the first occurrence of a key in the linked list
    public void deleteKey(int key) {
        Node current = head;
        Node prev = null;

        // If the key is found at the head
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        // Search for the key in the rest of the list
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If the key is not present
        if (current == null) {
            System.out.println("Key not found in the linked list");
            return;
        }

        // Delete the key by adjusting the pointers
        prev.next = current.next;
    }
}

public class DeleteKeyInLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Insert elements into the linked list
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);

        System.out.println("Linked List before deletion:");
        linkedList.display();

        // Delete the first occurrence of key 30
        linkedList.deleteKey(30);

        System.out.println("Linked List after deletion of key 30:");
        linkedList.display();
    }
}
