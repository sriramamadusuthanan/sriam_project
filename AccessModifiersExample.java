package problem1to10;

public class AccessModifiersExample {
	
	 // Public method accessible from anywhere
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Protected method accessible within the same package and by subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Default (no modifier) method accessible within the same package
    void defaultMethod() {
        System.out.println("This is a default (package-private) method.");
    }

    // Private method accessible only within this class
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        // Accessing methods with different access modifiers
        example.publicMethod();
        example.protectedMethod();
        example.defaultMethod();
        example.privateMethod();
    }

}
