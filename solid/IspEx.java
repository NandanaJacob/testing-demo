package solid;

import mod5.publisher;

interface Vehicle{
    void wheels();
    void doors();
}
interface Vehicle_withoutDoors{
    void wheels();
}
class Bike implements Vehicle{
    public void wheels(){
        System.out.println("Bike has two wheels");
    }
    public void doors(){
        //has no relevence
        System.out.println("Door not there for bike");
    }
}
//or
class Scooter implements Vehicle_withoutDoors{
    public void wheels(){
        System.out.println("Scooter has two wheels");
    }
}
class Car implements Vehicle{
    public void wheels(){
        System.out.println("car has 4 wheels");
    }
    public void doors(){
        System.out.println("Car has 4 doors");
    }
}
public class IspEx {
    public static void main(String[] args) {
        
    }
}
