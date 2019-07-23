import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookStock;
    private int capacity;

    public Library(int capacity) {
        this.bookStock = new ArrayList<Book>();
        this.capacity = capacity;
    }


    public int countBooks() {
        return this.bookStock.size();
    }

    public void addBook(Book book) {
        if (canAddBook()) {
            this.bookStock.add(book);
        }
    }

    public boolean canAddBook() {
        return this.capacity > countBooks();
    }

    public Book removeBook() {
        return this.bookStock.remove(0);
    }
}
