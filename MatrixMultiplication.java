package problem1to10;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the first matrix
        System.out.print("Enter the number of rows for the first matrix: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int colsA = scanner.nextInt();

        // Input elements of the first matrix
        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Enter the elements of the first matrix:");
        inputMatrix(matrixA, scanner);

        // Input dimensions of the second matrix
        System.out.print("Enter the number of rows for the second matrix: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int colsB = scanner.nextInt();

        // Input elements of the second matrix
        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Enter the elements of the second matrix:");
        inputMatrix(matrixB, scanner);

        // Check if matrix multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. Number of columns in the first matrix should be equal to the number of rows in the second matrix.");
        } else {
            // Multiply the matrices and display the result
            int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);
            System.out.println("Resultant Matrix after multiplication:");
            displayMatrix(resultMatrix);
        }

        scanner.close();
    }

    // Method to input elements of a matrix
    private static void inputMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to multiply two matrices
    private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        int[][] resultMatrix = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return resultMatrix;
    }

    // Method to display elements of a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}



