abstract class Animal // Cannot be instantiated
{
	abstract public void eating(); // no definition
	public void show() // concrete method
	{
		System.out.println("This is from abstract class");
	}
 
}
 
class Dog extends Animal
{
	public void eating()
	{
		System.out.println("Bones are prefferd");
	}
}
 
class Cat extends Animal
{
	public void eating()
	{
		System.out.println("fish and milk are prefferd");
	}
}
public class abstract_class {
 
	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		//c1.disp1();
		c1.eating();
		c1.show();
		
		Dog d1 = new Dog();
		d1.eating();
		d1.show();
		
		
	}
}
 
 
/* Access Modifier
*
* 1. Abstract
* 2. final
* 3. static
* 4. synchronized
* 5. volatile
* 6. transient
* 7. strictfp
*/
 
 