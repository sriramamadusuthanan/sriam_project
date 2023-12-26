package problem1to10;

public class MethodExample {
	
	// Method with no parameters and no return value
    public static void printHello() {
        System.out.println("Hello, World!");
    }

    // Method with parameters and return value
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with variable number of parameters
    public static double average(int... numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.length;
    }

    // Method with a different return type and exception handling
    public static int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        // Calling methods and printing results
        printHello();

        int sumResult = add(5, 3);
        System.out.println("Sum: " + sumResult);

        double avgResult = average(2, 4, 6, 8);
        System.out.println("Average: " + avgResult);

        try {
            int divideResult = divide(10, 2);
            System.out.println("Division Result: " + divideResult);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
