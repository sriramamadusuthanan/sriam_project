package problem1to10;

import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String userInput = scanner.next();

        try {
            // Attempt to convert the user input to an integer
            int number = Integer.parseInt(userInput);
            
            // Perform some operation with the number (just printing in this example)
            System.out.println("You entered: " + number);
            
        } catch (NumberFormatException e) {
            // Handle the exception if the input is not a valid integer
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            // Code in the finally block will be executed regardless of whether an exception occurred or not
            scanner.close();
        }

        System.out.println("Program continues...");

        // Rest of the program...
    }
}
