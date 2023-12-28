package problem1to10;

import java.util.Scanner;

public class EmailValidator {

    public static void main(String[] args) {
        // Array of employee email IDs
        String[] employeeEmails = {
                "john.doe@example.com",
                "jane.smith@example.com",
                "bob.jones@example.com",
                // Add more email IDs as needed
        };

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an email ID
        System.out.print("Enter an email ID to search: ");
        String searchEmail = scanner.nextLine();

        // Search for the entered email ID in the array
        boolean found = searchEmail(employeeEmails, searchEmail);

        // Display the result
        if (found) {
            System.out.println("Email ID found in the array.");
        } else {
            System.out.println("Email ID not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to search for an email ID in an array
    static boolean searchEmail(String[] emails, String searchEmail) {
        for (String email : emails) {
            if (email.equals(searchEmail)) {
                return true;
            }
        }
        return false;
    }
}


