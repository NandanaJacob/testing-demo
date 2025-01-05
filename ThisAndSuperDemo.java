class Animal {
    String name;

    // Constructor in Animal class
    Animal(String name) {
        this.name = name; // 'this' refers to the current class property
    }

    // Method in Animal class
    void display() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {
    String breed;

    // Constructor in Dog class
    Dog(String name, String breed) {
        super(name); // 'super' calls the constructor of the parent class (Animal)
        this.breed = breed; // 'this' refers to the current class property
    }

    // Method in Dog class
    void display() {
        super.display(); // 'super' calls the parent class method
        System.out.println("Dog Breed: " + breed);
    }
}

public class ThisAndSuperDemo {
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog = new Dog("Buddy", "Golden Retriever");

        // Call the display method
        dog.display();
    }
}
