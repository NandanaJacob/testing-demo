//import java.io.*;
//import javax.crypto.SecretKey;
import java.nio.file.*;
//import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        try {
            // Create storage directory
            String storagePath = "secure_storage";
            Files.createDirectories(Paths.get(storagePath));
            
            // Initialize secure storage
            SecureCustomerStorage storage = new SecureCustomerStorage(storagePath);
            
            // Create sample customer
            Customer customer = new Customer(
                "CUST001",
                "John Doe",
                "john.doe@email.com",
                "sensitive_password",
                50000.00,
                "Savings"
            );
            
            System.out.println("Original Customer:");
            System.out.println(customer);
            
            // Save customer data securely
            System.out.println("\nSaving customer data...");
            storage.saveCustomer(customer);
            
            // Load customer data
            System.out.println("\nLoading customer data...");
            Customer loadedCustomer = storage.loadCustomer("CUST001");
            
            System.out.println("\nLoaded Customer:");
            System.out.println(loadedCustomer);
            
            // Verify sensitive data handling
            System.out.println("\nVerifying sensitive data handling...");
            // Password should be null in loaded customer due to transient modifier
            System.out.println("Password preserved: " + 
                (loadedCustomer.toString().contains("sensitive_password") ? "Yes" : "No"));
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}




//____________________________________________________________________________________________
//============================================================================================
// Department.java
// Teaching_Staff.java
// Student_Details.java
// Student_Marks.java
// Main.java
/*public class Main {
    public static void main(String[] args) {
        // Create student marks objects with all necessary details
        Student_Marks[] students = new Student_Marks[5];
        
        // Student 1
        students[0] = new Student_Marks(
            "CS", "Computer Science", "A Block", 1995,
            "T101", "Dr. Smith", "PhD", "2015-01-15",
            "S1001", "John Doe", "9876543210", "john@email.com",
            new String[]{"T101", "T102", "T103", "T104"},
            1, new int[]{85, 90, 88, 92}
        );
        
        // Student 2
        students[1] = new Student_Marks(
            "CS", "Computer Science", "A Block", 1995,
            "T102", "Dr. Johnson", "PhD", "2016-02-20",
            "S1002", "Jane Smith", "9876543211", "jane@email.com",
            new String[]{"T101", "T102", "T103", "T104"},
            1, new int[]{95, 88, 91, 87}
        );
        
        // Student 3
        students[2] = new Student_Marks(
            "CS", "Computer Science", "A Block", 1995,
            "T103", "Dr. Williams", "PhD", "2014-06-10",
            "S1003", "Mike Brown", "9876543212", "mike@email.com",
            new String[]{"T101", "T102", "T103", "T104"},
            1, new int[]{82, 85, 89, 94}
        );
        
        // Student 4
        students[3] = new Student_Marks(
            "CS", "Computer Science", "A Block", 1995,
            "T104", "Dr. Davis", "PhD", "2017-03-25",
            "S1004", "Sarah Wilson", "9876543213", "sarah@email.com",
            new String[]{"T101", "T102", "T103", "T104"},
            1, new int[]{91, 93, 88, 86}
        );
        
        // Student 5
        students[4] = new Student_Marks(
            "CS", "Computer Science", "A Block", 1995,
            "T105", "Dr. Miller", "PhD", "2016-08-30",
            "S1005", "Tom Anderson", "9876543214", "tom@email.com",
            new String[]{"T101", "T102", "T103", "T104"},
            1, new int[]{87, 84, 90, 93}
        );
        
        // Display department details once
        students[0].displayDepartmentDetails();
        
        // Display details for all students
        for (Student_Marks student : students) {
            student.displayStudentDetails();
            student.displayMarksDetails();
            System.out.println("\n" + "=".repeat(50));
        }
    }
}*/