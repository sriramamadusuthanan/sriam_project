package problem1to10;

class Node2 {
    int data;
    Node2 next;
    Node2 prev;

    public Node2(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node2 head;

    // Method to insert a new node at the end of the doubly linked list
    public void insertEnd(int newData) {
        Node2 newNode = new Node2(newData);

        if (head == null) {
            head = newNode;
        } else {
            Node2 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Method to traverse the doubly linked list in the forward direction
    public void traverseForward() {
        System.out.println("Forward Traversal:");

        Node2 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    // Method to traverse the doubly linked list in the backward direction
    public void traverseBackward() {
        System.out.println("Backward Traversal:");

        Node2 current = head;
        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }

        System.out.println();
    }
}

public class DoublyLinkedListTraversal {
    public static void main(String[] args) {
        DoublyLinkedList doublyList = new DoublyLinkedList();

        // Insert elements into the doubly linked list
        doublyList.insertEnd(10);
        doublyList.insertEnd(20);
        doublyList.insertEnd(30);
        doublyList.insertEnd(40);

        // Traverse the doubly linked list in both forward and backward directions
        doublyList.traverseForward();
        doublyList.traverseBackward();
    }
}

