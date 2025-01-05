class Vehicle{
    public void startEngine(){
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle{
    public void startEngine(){
        System.out.println("Car is starting");
        super.startEngine();
    }
}
class Bike extends Vehicle{
    public void startEngine(){
        System.out.println("Bike is starting");
    }
}
public class VehicleOverride {
    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
    }
}
