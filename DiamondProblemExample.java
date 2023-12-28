package problem1to10;

//Common interface
interface Animal {
 void makeSound();
}

//Interface inheriting from Animal
interface Mammal extends Animal {
 void giveBirth();
}

//Another interface inheriting from Animal
interface Bird extends Animal {
 void layEggs();
}

//Concrete class implementing both Mammal and Bird interfaces
class Platypus implements Mammal, Bird {
 @Override
 public void makeSound() {
     System.out.println("Platypus says quack-quack");
 }

 @Override
 public void giveBirth() {
     System.out.println("Platypus gives birth to live young");
 }

 @Override
 public void layEggs() {
     System.out.println("Platypus lays eggs");
 }
}

public class DiamondProblemExample {
 public static void main(String[] args) {
     Platypus platypus = new Platypus();

     platypus.makeSound(); // Calls the makeSound method from Animal interface
     platypus.giveBirth(); // Calls the giveBirth method from Mammal interface
     platypus.layEggs();   // Calls the layEggs method from Bird interface
 }
}

