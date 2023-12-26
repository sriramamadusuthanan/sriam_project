package problem1to10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {

    public static void main(String[] args) {
        // Example 1: Pattern Matching
        String text = "The quick brown fox jumps over the lazy dog.";

        // Define a regular expression pattern
        String pattern = "fox";

        // Create a Pattern object
        Pattern patternObject = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = patternObject.matcher(text);

        // Check for matches
        if (matcher.find()) {
            System.out.println("Pattern found in the text.");
        } else {
            System.out.println("Pattern not found in the text.");
        }

        // Example 2: Pattern Matching and Extraction
        String email = "user@example.com";

        // Define a regular expression pattern for extracting the username and domain
        String emailPattern = "(\\w+)@(\\w+\\.\\w+)";

        // Create a Pattern object
        Pattern emailPatternObject = Pattern.compile(emailPattern);

        // Create a Matcher object
        Matcher emailMatcher = emailPatternObject.matcher(email);

        // Check for matches and extract information
        if (emailMatcher.matches()) {
            String username = emailMatcher.group(1);
            String domain = emailMatcher.group(2);

            System.out.println("\nEmail: " + email);
            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        } else {
            System.out.println("\nInvalid email format.");
        }
    }
}
