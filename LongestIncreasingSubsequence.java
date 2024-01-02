package problem1to10;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        int[] numbers = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int n = numbers.length;

        int[] lis = findLongestIncreasingSubsequence(numbers, n);

        System.out.println("Longest Increasing Subsequence: " + Arrays.toString(lis));
        System.out.println("Length of LIS: " + lis.length);
    }

    private static int[] findLongestIncreasingSubsequence(int[] arr, int n) {
        int[] lis = new int[n];
        Arrays.fill(lis, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        int maxLength = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            if (lis[i] > maxLength) {
                maxLength = lis[i];
                maxIndex = i;
            }
        }

        int[] result = new int[maxLength];
        result[--maxLength] = arr[maxIndex];

        for (int i = maxIndex - 1; i >= 0; i--) {
            if (arr[i] < arr[maxIndex] && lis[i] == lis[maxIndex] - 1) {
                result[--maxLength] = arr[i];
                maxIndex = i;
            }
        }

        return result;
    }
}

