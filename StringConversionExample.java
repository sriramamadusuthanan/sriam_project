package problem1to10;

public class StringConversionExample {

    public static void main(String[] args) {
        // Create a String
        String originalString = "Hello, World!";

        // Display the original String
        System.out.println("Original String: " + originalString);

        // Convert String to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(originalString);

        // Display the StringBuffer
        System.out.println("StringBuffer: " + stringBuffer);

        // Convert String to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(originalString);

        // Display the StringBuilder
        System.out.println("StringBuilder: " + stringBuilder);
    }
}
