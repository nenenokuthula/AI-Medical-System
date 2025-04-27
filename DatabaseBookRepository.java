public class DatabaseBookRepository implements BookRepository {
    @Override
    public void save(Book book) {
        throw new UnsupportedOperationException("Database storage not implemented yet.");
    }

    @Override
    public Optional<Book> findById(String id) {
        throw new UnsupportedOperationException("Database storage not implemented yet.");
    }

    @Override
    public List<Book> findAll() {
        throw new UnsupportedOperationException("Database storage not implemented yet.");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Database storage not implemented yet.");
    }
}
