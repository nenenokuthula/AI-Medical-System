public class RepositoryFactory {
    public static BookRepository getBookRepository(String storageType) {
        switch (storageType.toUpperCase()) {
            case "MEMORY":
                return new InMemoryBookRepository();
            case "DATABASE":
                return new DatabaseBookRepository(); // Stub implementation
            default:
                throw new IllegalArgumentException("Unknown storage type: " + storageType);
        }
    }
}
