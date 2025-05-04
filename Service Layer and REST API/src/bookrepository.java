import java.util.List;
import java.util.Optional;

class bookRepository {
}


class BookRepository {
    public Optional<Object> findById(String bookId) {
        return Optional.empty();
    }

    public Book save(Book book) {
        return book;
    }

    public Object findAll() {
        return null;
    }
}


public interface bookrepository {
    Optional<Book> findById(String id);
    List<Book> findAll();
    Book save(Book book);
}