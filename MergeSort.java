package problem1to10;

public class MergeSort {

    public static void mergeSort(int[] array) {
        int n = array.length;
        
        if (n > 1) {
            int mid = n / 2;

            int[] left = new int[mid];
            int[] right = new int[n - mid];

            // Copy data to temporary arrays left[] and right[]
            System.arraycopy(array, 0, left, 0, mid);
            System.arraycopy(array, mid, right, 0, n - mid);

            // Recursive sort both halves
            mergeSort(left);
            mergeSort(right);

            // Merge the sorted halves
            merge(array, left, right);
        }
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int n1 = left.length;
        int n2 = right.length;

        int i = 0, j = 0, k = 0;

        // Merge left[] and right[] back into array[]
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of left[], if there are any
        while (i < n1) {
            array[k] = left[i];
            i++;
            k++;
        }

        // Copy the remaining elements of right[], if there are any
        while (j < n2) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array:");
        printArray(array);

        // Perform Merge Sort
        mergeSort(array);

        System.out.println("Array after Merge Sort:");
        printArray(array);
    }
}

