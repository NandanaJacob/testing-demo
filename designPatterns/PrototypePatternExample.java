package designPatterns;

// Prototype interface
interface Prototype {
    Prototype clone();
}

// Concrete Prototype: Car
class Car implements Prototype {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }

    @Override
    public Prototype clone() {
        return new Car(this.model, this.color);  // Return a new object with the same attributes
    }
}

// Main class
public class PrototypePatternExample {
    public static void main(String[] args) {
        Car originalCar = new Car("Tesla Model 3", "Red");
        originalCar.displayInfo();

        // Clone the original car
        Car clonedCar = (Car) originalCar.clone();
        clonedCar.displayInfo();  // Cloned car has the same attributes as the original
    }
}
