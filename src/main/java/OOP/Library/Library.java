package OOP.Library;

public class Library {

    private long book_id;
    private String title, author;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getBook_id() {
        return book_id;
    }

    public void setBook_id(long book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void rentbook() {
        System.out.println("Book ID: " + this.book_id + " status is: " + this.status);
        String statusMessage = (this.status) ? "is reserved" : "not reserved";
        System.out.println("Status is: " + statusMessage);
    }

    public static void main(String[] args) {
        Library[] book = new Library[10];
        for (int i = 0; i < 10; i++) {
            book[i] = new Library();
            book[i].setBook_id(i);

            book[i].setStatus(i % 2 == 0);
        }
        book[2].rentbook();
    }
}