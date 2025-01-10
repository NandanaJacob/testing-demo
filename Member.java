import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Member implements Serializable {
    private String memberId;
    private String name;
    private List<Book> borrowedBooks;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Library library, String ISBN) 
            throws BookNotFoundException, NotEnoughBooksException {
        Book book = library.findBook(ISBN);
        if (!book.isAvailable()) {
            throw new NotEnoughBooksException("Book is not available for borrowing");
        }
        book.setAvailability(false);
        borrowedBooks.add(book);
    }

    public void returnBook(Library library, String ISBN) throws BookNotFoundException {
        Book book = library.findBook(ISBN);
        if (borrowedBooks.removeIf(b -> b.getISBN().equals(ISBN))) {
            book.setAvailability(true);
        } else {
            throw new BookNotFoundException("Book was not borrowed by this member");
        }
    }

    public List<Book> displayBorrowedBooks() {
        return new ArrayList<>(borrowedBooks);
    }

    @Override
    public String toString() {
        return String.format("Member: %s (ID: %s)", name, memberId);
    }
}