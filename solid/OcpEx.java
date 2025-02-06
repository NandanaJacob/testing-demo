package solid;
// Open/Close Principle
 
abstract class Vehicle
{
	abstract void wheels();
}
 
class Car extends Vehicle
{
	void wheels()
	{
		System.out.println("It's four wheeler");
	}
}
class Bike extends Vehicle
{
	void wheels()
	{
		System.out.println("It's two wheeler");
	}
}
public class OcpEx {
 
	public static void main(String[] args) {
		Vehicle v; // Dynamic method dispatcher
		v = new Bike();
		v.wheels();
	}
}
