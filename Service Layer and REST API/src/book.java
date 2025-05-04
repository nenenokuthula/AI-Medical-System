public class book {
}

class Book {
    private String id;
    private String title;
    private boolean checkedOut;

    public Book() {}

    public Book(String id, String title, boolean checkedOut) {
        this.id = id;
        this.title = title;
        this.checkedOut = checkedOut;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public boolean isCheckedOut() { return checkedOut; }
    public void setCheckedOut(boolean checkedOut) { this.checkedOut = checkedOut; }
}