import java.util.List;
import java.util.Map;

public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    public Book addBook(Book book) {
        return bookService.addBook(book);
    }

    public Book updateBook(String id, Book book) {
        return bookService.updateBook(id, book);
    }

    public Map<String, Object> checkoutBook(String id) {
        Book book = bookService.checkoutBook(id);
        Map<String, Object> response = Map.of(
                "message", "Book checked out",
                "book", book
        );
        Object ResponseEntity = null;
        Map<String, Object> response1 = response;
        return (response);
    }
}
