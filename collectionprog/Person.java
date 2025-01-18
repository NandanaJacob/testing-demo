package collectionprog;

public class Person{ //implements Comparable<Employee> 
    private int age;
    private String name;
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    public Person(int age, String name) {
        super(); //allow u to interact with iska parent aka object class
        this.age = age;
        this.name = name;
    }

    //Override equals to compare keys logically
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Reference equality
        if (obj == null || getClass() != obj.getClass()) return false; // Type check
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name); // Logical equality
    }

    // // Override hashCode to ensure consistent hashing
    @Override
    public int hashCode() {
        int result = Integer.hashCode(age);
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}




    // @Override
    // public int compareTo(Person other) {
    //     return Integer.compare(this.age, other.age); // Compare based on age
    // }
    
}
