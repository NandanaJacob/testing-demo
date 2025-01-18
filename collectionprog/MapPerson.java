//task qn. create ur own Person pojo class

package collectionprog;

import java.util.HashMap;

public class MapPerson {
 
	public static void main(String[] args) {
		
		Person person1 = new Person(34,"Mike");
		Person person2 = new Person(34,"Mike");
		System.out.println ( person1 == person2 ); //deals with memory loc
		System.out.println(person1.equals(person2)); //deals with logical equivalence
		
		HashMap<Person, String> map = new HashMap<>();   
		map.put(person1, "1");	
		map.put(person2, "2");

        // Compare references and values
        System.out.println("Reference equality: " + (person1 == person2)); // false
        System.out.println("Value equality: " + person1.equals(person2));  // true

        System.out.println(person1.hashCode()); // Same hash code for logically equal objects.
        System.out.println(person2.hashCode());  
		
		System.out.println(map);
	}
	
}