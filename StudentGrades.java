import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        // Step 1: Declare and initialize arrays
        int numberOfStudents = 5; // You can change this as needed
        String[] studentNames = new String[numberOfStudents];
        int[] studentGrades = new int[numberOfStudents];

        Scanner scanner = new Scanner(System.in);

        // Step 2: Input student names and grades
        System.out.println("Enter student names and their grades:");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student " + (i + 1) + " name: ");
            studentNames[i] = scanner.nextLine();

            System.out.print("Student " + (i + 1) + " grade: ");
            studentGrades[i] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        }

        // Step 3: Calculate the average grade
        int totalGrades = 0;
        for (int grade : studentGrades) {
            totalGrades += grade;
        }
        double averageGrade = (double) totalGrades / numberOfStudents;

        // Step 4: Display all student data and the average grade
        System.out.println("\nStudent Grades:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(studentNames[i] + ": " + studentGrades[i]);
        }
        System.out.println("Average Grade: " + averageGrade);

        // Step 5: Determine students who scored above average
        System.out.println("\nStudents who scored above the average:");
        for (int i = 0; i < numberOfStudents; i++) {
            if (studentGrades[i] > averageGrade) {
                System.out.println(studentNames[i] + ": " + studentGrades[i]);
            }
        }

        scanner.close();
    }
}
