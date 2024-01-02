package problem1to10;

import java.util.Arrays;

public class FourthSmallestElement {
    public static void main(String[] args) {
        int[] unsortedList = {10, 5, 8, 3, 9, 4, 2, 7, 1, 6};

        int fourthSmallest = findFourthSmallest(unsortedList);

        System.out.println("The fourth smallest element is: " + fourthSmallest);
    }

    private static int findFourthSmallest(int[] arr) {
        if (arr.length < 4) {
            System.out.println("The array does not have at least four elements.");
            return -1; // indicating an error or no result
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the fourth smallest element
        return arr[3];
    }
}

