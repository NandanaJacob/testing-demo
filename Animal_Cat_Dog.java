// Define the abstract class Animal
abstract class Animal {
    protected String name; // Animal name

    public Animal(String name) {
        this.name = name; // Constructor to set the name
    }

    // Abstract method to be implemented by subclasses
    public abstract void makeSound();
}

// Dog class extending Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the constructor of the Animal class
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!"); // Dog sound
    }
}

// Cat class extending Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name); // Call the constructor of the Animal class
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!"); // Cat sound
    }
}

// Main class to demonstrate polymorphism
public class Animal_Cat_Dog{
    public static void main(String[] args) {
        // Create an array of Animal objects
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Buddy"); // Dog instance
        animals[1] = new Cat("Whiskers"); // Cat instance

        // Loop through the array and call makeSound() for each animal
        for (Animal animal : animals) {
            animal.makeSound(); // Polymorphic call
        }
    }
}
