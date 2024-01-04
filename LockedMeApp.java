package problem1to10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LockedMeApp {

    private static final List<String> fileNames = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayWelcomeScreen();
        int choice;

        do {
            displayUserOptions();
            choice = getUserChoice();

            switch (choice) {
                case 1:
                    displayFileNamesInAscendingOrder();
                    break;
                case 2:
                    handleFileOperations();
                    break;
                case 3:
                    System.out.println("Closing the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void displayWelcomeScreen() {
        System.out.println("Welcome to LockedMe.com - Virtual Key for Your Repositories");
        System.out.println("Developer:M Srirama Madusuthanans");
        System.out.println("-------------------------------------------");
    }

    private static void displayUserOptions() {
        System.out.println("1. Display current file names in ascending order");
        System.out.println("2. File operations");
        System.out.println("3. Close the application");
    }

    private static int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    private static void displayFileNamesInAscendingOrder() {
        if (fileNames.isEmpty()) {
            System.out.println("The directory is empty.");
        } else {
            Collections.sort(fileNames);
            System.out.println("List of file names in ascending order:");
            for (String fileName : fileNames) {
                System.out.println(fileName);
            }
        }
    }

    private static void handleFileOperations() {
        int fileOperationChoice;

        do {
            displayFileOperationOptions();
            fileOperationChoice = getUserChoice();

            switch (fileOperationChoice) {
                case 1:
                    addFile();
                    break;
                case 2:
                    deleteFile();
                    break;
                case 3:
                    searchFile();
                    break;
                case 4:
                    System.out.println("Returning to the main menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        } while (fileOperationChoice != 4);
    }

    private static void displayFileOperationOptions() {
        System.out.println("1. Add a file");
        System.out.println("2. Delete a file");
        System.out.println("3. Search for a file");
        System.out.println("4. Return to the main menu");
    }

    private static void addFile() {
        System.out.print("Enter the file name to add: ");
        String fileName = scanner.next();
        fileNames.add(fileName);
        System.out.println("File added successfully.");
    }

    private static void deleteFile() {
        System.out.print("Enter the file name to delete: ");
        String fileName = scanner.next();
        if (fileNames.remove(fileName)) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("File not found.");
        }
    }

    private static void searchFile() {
        System.out.print("Enter the file name to search: ");
        String fileName = scanner.next();
        if (fileNames.contains(fileName)) {
            System.out.println("File found.");
        } else {
            System.out.println("File not found.");
        }
    }
}

