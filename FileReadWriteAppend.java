package problem1to10;
import java.io.*;

public class FileReadWriteAppend {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Write to the file
        writeToFile(filePath, "Hello, World!");

        // Read from the file
        readFromFile(filePath);

        // Append to the file
        appendToFile(filePath, "\nAppended content.");

        // Read the updated content
        readFromFile(filePath);
    }

    // Write to a file
    private static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Content written to the file.");

        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }

    // Read from a file
    private static void readFromFile(String filePath) {
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

    // Append to a file
    private static void appendToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.newLine(); // Move to a new line before appending content
            writer.write(content);
            System.out.println("Content appended to the file.");

        } catch (IOException e) {
            System.out.println("Error appending to the file: " + e.getMessage());
        }
    }
}
