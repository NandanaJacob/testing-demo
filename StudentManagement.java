import java.util.Scanner;

class Student {
    // Properties of the Student class
    private String name;
    private int rollNo;
    private double marks;

    // Constructor
    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    // Method to update student details
    public void updateDetails(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        System.out.println("Student details updated successfully!");
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Student object
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();
        System.out.print("Enter marks: ");
        double marks = scanner.nextDouble();

        Student student = new Student(name, rollNo, marks);

        int choice;
        do {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Display Student Details");
            System.out.println("2. Update Student Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: // Display details
                    student.displayDetails();
                    break;

                case 2: // Update details
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new roll number: ");
                    int newRollNo = scanner.nextInt();
                    System.out.print("Enter new marks: ");
                    double newMarks = scanner.nextDouble();
                    student.updateDetails(newName, newRollNo, newMarks);
                    break;

                case 3: // Exit
                    System.out.println("Exiting the program....");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }

        } while (choice != 3); // Repeat until the user chooses to exit

        // Close the scanner
        scanner.close();
    }
}
