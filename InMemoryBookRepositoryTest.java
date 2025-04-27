import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InMemoryBookRepositoryTest {
    private InMemoryBookRepository repository;

    @BeforeEach
    public void setUp() {
        repository = new InMemoryBookRepository();
    }

    @Test
    public void testSaveAndFind() {
        Book book = new Book("1", "Effective Java");
        repository.save(book);
        assertTrue(repository.findById("1").isPresent());
    }

    @Test
    public void testFindAll() {
        repository.save(new Book("1", "Effective Java"));
        repository.save(new Book("2", "Clean Code"));
        assertEquals(2, repository.findAll().size());
    }

    @Test
    public void testDelete() {
        Book book = new Book("1", "Effective Java");
        repository.save(book);
        repository.delete("1");
        assertFalse(repository.findById("1").isPresent());
    }
}
