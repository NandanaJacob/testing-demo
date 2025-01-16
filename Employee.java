public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int sal;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSal() {
        return sal;
    }
    public void setSal(int sal) {
        this.sal = sal;
    }
    public Employee(int id, String name, int sal) {
        super(); //allow u to interact with iska parent aka object class
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
    //adding compareTo function from Compare interface to compare based on id
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id); // Compare based on ID
    }
}
