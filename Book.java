import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Book extends LibraryItem implements Serializable {
    private String ISBN;
    private String author;
    private String genre;

    public Book(String ISBN, String title, String author, String genre, double price) {
        super(title, price);
        this.ISBN = ISBN;
        this.author = author;
        this.genre = genre;
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    // Getters and setters
    public String getISBN() { return ISBN; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }

    @Override
    public String toString() {
        return String.format("Book: %s by %s (ISBN: %s) - Genre: %s - Price: $%.2f - Available: %s",
                title, author, ISBN, genre, price, availability);
    }
}
