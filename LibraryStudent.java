import java.util.Scanner;

class Book {
    // Properties of the Student class
    private String title;
    private String author;
    private int isbn;

    // Constructor
    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Book title: " + title);
        System.out.println("Author name: " + author);
        System.out.println("isbn: " + isbn);
    }

    // Method to update student details
    public void updateDetails(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        System.out.println("Book details updated successfully!");
    }

    // public void setAvailability(boolean b) {
    //     throw new UnsupportedOperationException("Unimplemented method 'setAvailability'");
    // }

    // public boolean isAvailable() {
    //     throw new UnsupportedOperationException("Unimplemented method 'isAvailable'");
    // }
}

public class LibraryStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Student object
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter isbn: ");
        int isbn = scanner.nextInt();

        Book book = new Book(title, author, isbn);

        int choice;
        do {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Display Book Details");
            System.out.println("2. Update Book Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: // Display details
                    book.displayDetails();
                    break;

                case 2: // Update details
                    System.out.print("Enter new title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new authors name: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Enter new isbn: ");
                    int newISBN = scanner.nextInt();
                    book.updateDetails(newTitle, newAuthor, newISBN);
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
