// First interface
interface Animal {
    void sound(); // Method declaration
}

// Second interface
interface Pet {
    void play(); // Method declaration
}

// Class implementing both interfaces
class Dog implements Animal, Pet {
    // Implement method from Animal
    public void sound() {
        System.out.println("The dog barks.");
    }

    // Implement method from Pet
    public void play() {
        System.out.println("The dog loves to play fetch.");
    }
}

public class mult_inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create an object of the Dog class
        myDog.sound(); // Call the method from Animal
        myDog.play();  // Call the method from Pet
    }
}
// NOTE
// in java, mult inheritance cannot happen using classes
//thats y we used interfaces
//in interfacess, we can only declare methods.
//they must be defined in the class that inherits the interface