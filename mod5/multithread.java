package mod5;

import java.util.Scanner;

// 1. Create a class implementing the Runnable interface
class EmployeeThread implements Runnable {
    private String employeeName;
    private int employeeId;

    // Constructor to initialize employee details
    public EmployeeThread(String name, int id) {
        this.employeeName = name;
        this.employeeId = id;
    }

    // 2. Implement the run method from the Runnable interface
    @Override
    synchronized public void run() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + employeeName);
    }
}

public class multithread{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Create threads for each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            // Create an EmployeeThread object and start the thread
            EmployeeThread employee = new EmployeeThread(name, id);
            Thread thread = new Thread(employee); // Pass the Runnable object to the Thread
            thread.start(); // Start the thread
        }

        scanner.close(); // Close the scanner
    }
}
