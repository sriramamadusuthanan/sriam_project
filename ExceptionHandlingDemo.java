package problem1to10;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get two numbers from the user
            System.out.print("Enter the first number: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the second number: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            // Perform division
            int result = divideNumbers(num1, num2);

            // Print the result
            System.out.println("Result of division: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter valid integers.");

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } finally {
            // This block will be executed regardless of whether an exception occurred or not
            System.out.println("Finally block: This code will always run.");
            
            // Close the scanner
            scanner.close();
        }

        // The program continues here after the try-catch-finally blocks
        System.out.println("Program continues...");
    }

    // Method to perform division
    private static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }
}
