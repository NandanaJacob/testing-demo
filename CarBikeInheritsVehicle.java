// Base class
class Vehicle {
    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Starting engine of the vehicle.");
    }
}

// Derived class Car
class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine of the car: " + make + " " + model);
    }
}

// Derived class Motorcycle
class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model) {
        super(make, model);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine of the motorcycle: " + make + " " + model);
    }
}

// Main class to demonstrate polymorphism
public class CarBikeInheritsVehicle{
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota", "Corolla");
        Vehicle myMotorcycle = new Motorcycle("Harley-Davidson", "Sportster");

        myCar.startEngine();         // Calls Car's startEngine method
        myMotorcycle.startEngine();  // Calls Motorcycle's startEngine method
    }
}
