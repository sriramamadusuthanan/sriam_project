package problem1to10;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        try {
            // Example of using 'throw' to manually throw an exception
            throw new CustomException("This is a custom exception.");

        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());

        } finally {
            System.out.println("This block will be executed regardless of whether an exception occurred or not.");
        }

        // Example of using 'throws' in a method signature
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Caught arithmetic exception: " + e.getMessage());
        }
    }

    // Example of using 'throws' in a method signature to indicate that the method may throw an exception
    private static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            // Example of using 'throw' to manually throw an exception
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return numerator / denominator;
    }
}

