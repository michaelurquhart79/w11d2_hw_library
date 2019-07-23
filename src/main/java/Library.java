import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookStock;

    public Library() {
        this.bookStock = new ArrayList<Book>();
    }


    public int countBooks() {
        return this.bookStock.size();
    }

    public void addBook(Book book) {
        this.bookStock.add(book);
    }
}
