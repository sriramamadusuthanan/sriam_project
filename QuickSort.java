package problem1to10;

public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find the pivot index such that elements smaller than the pivot are on the left
            // and elements greater than the pivot are on the right
            int pivotIndex = partition(array, low, high);

            // Recursively sort the sub-arrays
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        // Rearrange elements: elements smaller than the pivot to the left, and greater to the right
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Return the index of the pivot element
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(array);

        // Perform Quick Sort
        quickSort(array, 0, array.length - 1);

        System.out.println("Array after Quick Sort:");
        printArray(array);
    }
}
