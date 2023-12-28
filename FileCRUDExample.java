package problem1to10;

import java.io.*;

public class FileCRUDExample {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Create a file
        createFile(filePath);

        // Read from the file
        readFile(filePath);

        // Update the file
        updateFile(filePath, "Updated content");

        // Read the updated content
        readFile(filePath);

        // Delete the file
        deleteFile(filePath);
    }

    // Create a file
    private static void createFile(String filePath) {
        try {
            File file = new File(filePath);

            // Check if the file already exists
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("Error creating the file: " + e.getMessage());
        }
    }

    // Read from a file
    private static void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("Reading from the file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading from the file: " + e.getMessage());
        }
    }

    // Update a file
    private static void updateFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.newLine(); // Move to a new line before adding content
            writer.write(content);
            System.out.println("File updated.");

        } catch (IOException e) {
            System.out.println("Error updating the file: " + e.getMessage());
        }
    }

    // Delete a file
    private static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("File deleted: " + file.getAbsolutePath());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
