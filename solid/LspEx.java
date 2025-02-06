package solid;

//Liskov Subtstitution Principle
 
class Bird
{
	public void fly()
	{
		System.out.println("Bird can fly");
	}
}
class Eagle extends Bird
{
}
 
class Penguin extends Bird
{
	public void fly()
	{
		throw new UnsupportedOperationException("Penguin's cannot fly");
	}
}
public class LspEx {
 
	public static void main(String[] args) {
		Bird eagle = new Eagle();
		eagle.fly();
		Bird penguin = new Penguin();
		penguin.fly();
	}
}

