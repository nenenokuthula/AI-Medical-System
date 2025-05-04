import java.util.List;

public class BookService {
    private final BookRepository bookRepo;

    public BookService(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    public Book checkoutBook(String bookId) {
        Book book = (Book) bookRepo.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found: " + bookId));

        if (book.isCheckedOut()) {
            throw new RuntimeException("Book already checked out: " + bookId);
        }

        book.setCheckedOut(true);
        return bookRepo.save(book);
    }

    public List<Book> getAllBooks() {
        return (List<Book>) bookRepo.findAll();
    }

    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

    public Book updateBook(String id, Book updatedBook) {
        Book book = (Book) bookRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        book.setCheckedOut(updatedBook.isCheckedOut());
        return bookRepo.save(book);
    }
}