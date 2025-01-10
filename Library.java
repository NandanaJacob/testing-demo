import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Library class to manage books
public class Library implements Serializable {
    private String name;
    private String address;
    private List<Book> books;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String ISBN) throws BookNotFoundException {
        Book bookToRemove = books.stream()
                .filter(book -> book.getISBN().equals(ISBN))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book with ISBN " + ISBN + " not found"));
        books.remove(bookToRemove);
    }

    public List<Book> searchByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public List<Book> searchByGenre(String genre) {
        return books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    public List<Book> displayAvailableBooks() {
        return books.stream()
                .filter(Book::isAvailable)
                .collect(Collectors.toList());
    }

    public Book findBook(String ISBN) throws BookNotFoundException {
        return books.stream()
                .filter(book -> book.getISBN().equals(ISBN))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book with ISBN " + ISBN + " not found"));
    }
}
