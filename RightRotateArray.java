package problem1to10;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rotateSteps = 5;

        System.out.println("Original Array: ");
        printArray(arr);

        rightRotate(arr, rotateSteps);

        System.out.println("\nArray after right rotation by " + rotateSteps + " steps: ");
        printArray(arr);
    }

    // Function to right rotate an array by 'steps'
    private static void rightRotate(int[] arr, int steps) {
        int n = arr.length;
        steps = steps % n; // handle cases where steps are greater than array length

        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, steps - 1);
        reverseArray(arr, steps, n - 1);
    }

    // Function to reverse elements of an array in the given range
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to print the elements of an array
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

