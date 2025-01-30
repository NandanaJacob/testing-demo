package layers;
// controller class
import java.util.Scanner;
 
public class StudentController {
    private StudentService service;
 
    // Constructor for dependency injection
    public StudentController(StudentService service) {
        this.service = service;
    }
 
    // Start the application
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Find Student by ID");
            System.out.println("4. Exit");
            System.out.println("5. Update a student");
            System.out.println("6. Delete a student");
            System.out.print("Enter your choice: ");
 
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();
                    Student student = new Student(id, name, course);
                    service.add(student);
                    break;
                case 2:
                    service.getAllStudents().forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId = scanner.nextInt();
                    Student foundStudent = service.getStudentByID(searchId);
                    if (foundStudent != null) {
                        System.out.println("Student found: " + foundStudent);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                case 5:
                    System.out.print("Enter Student ID to update: ");
                    int id_old = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new Student ID: ");
                    int id_new = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new Student Name: ");
                    String name_new = scanner.nextLine();
                    System.out.print("Enter new Course: ");
                    String course_new = scanner.nextLine();
                    service.update(id_old, name_new, id_new, course_new);
                    break;
                case 6:
                    System.out.print("Enter Student ID to delete: ");
                    int id_delete = scanner.nextInt();
                    scanner.nextLine();
                    service.delete(id_delete);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
 