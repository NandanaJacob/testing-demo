import java.io.IOException;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        try {
            // Create library
            Library library = new Library("Central Library", "123 Main St");

            // Add books
            library.addBook(new Book("123", "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 9.99));
            library.addBook(new Book("456", "1984", "George Orwell", "Fiction", 12.99));
            library.addBook(new Book("789", "The Clean Coder", "Robert Martin", "Technical", 29.99));

            // Create member
            Member member = new Member("M001", "John Doe");

            // Demonstrate functionality
            System.out.println("Available books:");
            library.displayAvailableBooks().forEach(System.out::println);

            // Borrow a book
            member.borrowBook(library, "123");
            System.out.println("\nAfter borrowing - Member's books:");
            member.displayBorrowedBooks().forEach(System.out::println);

            // Search by author
            System.out.println("\nBooks by George Orwell:");
            library.searchByAuthor("George Orwell").forEach(System.out::println);

            // Serialize library
            SerializationHandler.serializeLibrary(library, "library.dat");

            // Deserialize library
            Library loadedLibrary = SerializationHandler.deserializeLibrary("library.dat");
            System.out.println("\nDeserialized library - Available books:");
            loadedLibrary.displayAvailableBooks().forEach(System.out::println);

        } catch (BookNotFoundException | NotEnoughBooksException | IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}