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

		System.out.println("________________________________________");
		//DYNAMIC METHOD DISPATCHER
		System.out.println("DYNAMIC METHOD DISPATCHER EXAMPLE-");
		System.out.println("________________________________________");
		//u cannot creaate an object of animal, but a reference is possible=>
		Animal a1;
		//u can use the same reference to call both cat and dog child classes=>
		a1 = new Cat();
		a1.eating();;
		a1.show();
		a1 = new Dog();
		a1.eating();;
		a1.show();
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
 
 