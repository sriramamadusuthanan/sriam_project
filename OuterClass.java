package problem1to10;

//Outer class
public class OuterClass {

 // Member variables of the outer class
 private int outerVariable = 10;
 private static int staticOuterVariable = 20;

 // Regular Inner class
 public class InnerClass {
     // Member variable of the inner class
     private int innerVariable = 5;

     // Inner class method accessing outer class variables
     public void display() {
         System.out.println("Outer Variable: " + outerVariable);
         System.out.println("Inner Variable: " + innerVariable);
     }
 }

 // Static Nested class
 public static class StaticNestedClass {
     // Static nested class method
     public void display() {
         System.out.println("Static Outer Variable: " + staticOuterVariable);
     }
 }

 // Method with an anonymous inner class
 public void useAnonymousInnerClass() {
     // Local variable used in the anonymous inner class
     final int localVar = 30;

     // Anonymous Inner class
     Runnable runnable = new Runnable() {
         @Override
         public void run() {
             System.out.println("Local Variable in Anonymous Inner Class: " + localVar);
         }
     };

     // Calling the run method of the anonymous inner class
     runnable.run();
 }

 public static void main(String[] args) {
     // Creating an instance of the outer class
     OuterClass outerObject = new OuterClass();

     // Creating an instance of the regular inner class
     OuterClass.InnerClass innerObject = outerObject.new InnerClass();

     // Creating an instance of the static nested class
     OuterClass.StaticNestedClass staticNestedObject = new OuterClass.StaticNestedClass();

     // Using regular inner class method
     System.out.println("Regular Inner Class Example:");
     innerObject.display();

     // Using static nested class method
     System.out.println("\nStatic Nested Class Example:");
     staticNestedObject.display();

     // Using anonymous inner class
     System.out.println("\nAnonymous Inner Class Example:");
     outerObject.useAnonymousInnerClass();
 }
}

