package solid;

import java.util.Scanner;
 
interface Bird
{
	 void fly();
}
class Eagle implements Bird
{
	public void fly()
	{
		System.out.println("Eagle flies high");
	}
}
 
class Sparrow implements Bird
{
	public void fly()
	{
		System.out.println("Sparrow flies for little height");
	}
}
class BirdFactory
{
	public Bird getBird(String birdType)
	{
		if(birdType == null)
		{
			return null;
		}
		if(birdType.equalsIgnoreCase("Eagle"))
		{
			return new Eagle();
		}
		else if(birdType.equalsIgnoreCase("sparrow"))
		{
			return new Sparrow();
		}
		return null;
	}
}
public class FactoryEx {
 
	public static void main(String[] args) {
		BirdFactory birdFactory = new BirdFactory();
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide name of the bird to run");
		String bird = sc.next();
		Bird b= birdFactory.getBird(bird);
		b.fly();
	}
}


