package problem1to10;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Insert elements into the stack (push)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after pushing elements:");
        displayStack(stack);

        // Remove elements from the stack (pop)
        int poppedElement = stack.pop();
        System.out.println("\nPopped element: " + poppedElement);

        System.out.println("Stack after popping an element:");
        displayStack(stack);

        // Peek (view) the top element without removing it
        int topElement = stack.peek();
        System.out.println("\nTop element (without removal): " + topElement);

        // Insert another element into the stack
        stack.push(40);

        System.out.println("\nStack after pushing another element:");
        displayStack(stack);
    }

    // Method to display the elements of the stack
    private static void displayStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

