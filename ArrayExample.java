package problem1to10;

public class ArrayExample {

    public static void main(String[] args) {
        // Declaration and initialization of an array of integers
        int[] intArray = {1, 2, 3, 4, 5};

        // Display the elements of the array
        System.out.println("Array of Integers:");
        displayIntArray(intArray);

        // Declaration and initialization of an array of strings
        String[] stringArray = {"Java", "C", "Python", "JavaScript"};

        // Display the elements of the array
        System.out.println("\nArray of Strings:");
        displayStringArray(stringArray);

        // Declaration and initialization of a two-dimensional array
        int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Display the elements of the two-dimensional array
        System.out.println("\nTwo-Dimensional Array:");
        displayTwoDArray(twoDArray);
    }

    // Helper method to display elements of an integer array
    private static void displayIntArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Helper method to display elements of a string array
    private static void displayStringArray(String[] array) {
        for (String value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Helper method to display elements of a two-dimensional array
    private static void displayTwoDArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

