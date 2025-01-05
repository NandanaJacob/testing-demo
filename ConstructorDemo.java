class Person {
    // Properties of the Person class
    private String name;
    private int age;

    // Default constructor
    public Person() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called.");
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Create an object using the default constructor
        System.out.println("Creating a person using the default constructor:");
        Person person1 = new Person();
        person1.displayDetails();

        System.out.println();

        // Create an object using the parameterized constructor
        System.out.println("Creating a person using the parameterized constructor:");
        Person person2 = new Person("Alice", 25);
        person2.displayDetails();
    }
}
