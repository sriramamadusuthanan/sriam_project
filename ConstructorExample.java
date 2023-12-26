package problem1to10;

public class ConstructorExample {
	
	   // Class variables
    private int id;
    private String name;

    // Default Constructor
    public ConstructorExample() {
        // Default values
        this.id = 0;
        this.name = "Default";
    }

    // Parameterized Constructor
    public ConstructorExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy Constructor
    public ConstructorExample(ConstructorExample other) {
        this.id = other.id;
        this.name = other.name;
    }

    // Display method to print object details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorExample defaultConstructorObj = new ConstructorExample();
        ConstructorExample parameterizedConstructorObj = new ConstructorExample(1, "John");

        // Displaying details of objects
        System.out.println("Default Constructor Object:");
        defaultConstructorObj.display();

        System.out.println("\nParameterized Constructor Object:");
        parameterizedConstructorObj.display();

        // Creating an object using the copy constructor
        ConstructorExample copyConstructorObj = new ConstructorExample(parameterizedConstructorObj);

        // Displaying details of the copied object
        System.out.println("\nCopy Constructor Object:");
        copyConstructorObj.display();
    }

}
