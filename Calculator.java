package problem1to10;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Arithmetic Calculator");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter choice (1/2/3/4): ");
        char choice = scanner.next().charAt(0);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        switch (choice) {
            case '1':
                System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                break;
            case '2':
                System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
                break;
            case '3':
                System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                break;
            case '4':
                System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
                break;
            default:
                System.out.println("Invalid input");
        }

        scanner.close();
    }

    static double add(double x, double y) {
        return x + y;
    }

    static double subtract(double x, double y) {
        return x - y;
    }

    static double multiply(double x, double y) {
        return x * y;
    }

    static double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // NaN (Not a Number) represents an undefined result
        }
    }
}

	
	