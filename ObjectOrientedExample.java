package problem1to10;

//Class representing a basic shape
class Shape {
 // Encapsulation: private fields
 private String color;

 // Constructor
 public Shape(String color) {
     this.color = color;
 }

 // Getter method
 public String getColor() {
     return color;
 }

 // Abstraction: abstract method
 public double calculateArea() {
     return 0.0;
 }

 // Polymorphism: overridden toString method
 @Override
 public String toString() {
     return "Shape[color=" + color + "]";
 }
}

//Subclass representing a specific shape - Circle
class Circle extends Shape {
 // Encapsulation: private field
 private double radius;

 // Constructor
 public Circle(String color, double radius) {
     super(color); // Inheritance: invoking superclass constructor
     this.radius = radius;
 }

 // Polymorphism: overridden calculateArea method
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }

 // Polymorphism: overridden toString method
 @Override
 public String toString() {
     return "Circle[color=" + getColor() + ", radius=" + radius + "]";
 }
}

//Subclass representing a specific shape - Rectangle
class Rectangle extends Shape {
 // Encapsulation: private fields
 private double length;
 private double width;

 // Constructor
 public Rectangle(String color, double length, double width) {
     super(color); // Inheritance: invoking superclass constructor
     this.length = length;
     this.width = width;
 }

 // Polymorphism: overridden calculateArea method
 @Override
 public double calculateArea() {
     return length * width;
 }

 // Polymorphism: overridden toString method
 @Override
 public String toString() {
     return "Rectangle[color=" + getColor() + ", length=" + length + ", width=" + width + "]";
 }
}

//Main class to demonstrate the use of classes and objects
public class ObjectOrientedExample {
 public static void main(String[] args) {
     // Creating objects of Circle and Rectangle classes
     Circle circle = new Circle("Red", 5.0);
     Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

     // Displaying information about the shapes
     System.out.println(circle); // Uses overridden toString method
     System.out.println("Area of Circle: " + circle.calculateArea());

     System.out.println(rectangle); // Uses overridden toString method
     System.out.println("Area of Rectangle: " + rectangle.calculateArea());
 }
}

