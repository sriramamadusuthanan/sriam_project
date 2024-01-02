package problem1to10;

import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] array = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the range L and R
        System.out.print("Enter the range (L and R): ");
        int L = scanner.nextInt();
        int R = scanner.nextInt();

        // Calculate and display the sum in the given range
        int sumInRange = calculateSumInRange(array, L, R);
        System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sumInRange);

        scanner.close();
    }

    private static int calculateSumInRange(int[] array, int L, int R) {
        int sum = 0;

        if (L < 0 || R >= array.length || L > R) {
            System.out.println("Invalid range");
            return -1; // indicating an error or no result
        }

        for (int i = L; i <= R; i++) {
            sum += array[i];
        }

        return sum;
    }
}

