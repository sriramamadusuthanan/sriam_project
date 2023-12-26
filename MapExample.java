package problem1to10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> studentScores = new HashMap<>();

        // Add entries to the map
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 87);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 78);

        // Display the map
        System.out.println("Initial Map:");
        displayMap(studentScores);

        // Update a value
        studentScores.put("Bob", 90);

        // Display the map after the update
        System.out.println("\nMap after Update:");
        displayMap(studentScores);

        // Remove an entry
        studentScores.remove("Charlie");

        // Display the map after the removal
        System.out.println("\nMap after Removal:");
        displayMap(studentScores);

        // Check if a key is present
        String searchKey = "Alice";
        if (studentScores.containsKey(searchKey)) {
            System.out.println("\n" + searchKey + "'s Score: " + studentScores.get(searchKey));
        } else {
            System.out.println("\n" + searchKey + " not found in the map.");
        }
    }

    // Helper method to display the contents of the map
    private static void displayMap(Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
