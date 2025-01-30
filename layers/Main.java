package layers;
// Main class
public class Main {
 
	public static void main(String[] args) {
		
		StudentRepository repository = new StudentRepository();
		StudentService service = new StudentService(repository);
		StudentController controller = new StudentController(service);
		
		controller.start();
	}
}