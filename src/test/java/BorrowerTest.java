import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower1;
    private Book book1;
    private Book book2;
    private Library library;


    @Before
    public void before() {
        borrower1 = new Borrower();
        book1 = new Book("Fight Club", "Geoff Palladnuik", "fiction");
        book2 = new Book("The Life of Pi", "Some Guy", "fiction");
        library = new Library(2);
    }

    @Test
    public void hasNoBooksInitially() {
        assertEquals(0, borrower1.numberBorrowed());
    }

    @Test
    public void canAddABookToBorrower() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.countBooks());
        assertEquals(0, borrower1.numberBorrowed());
        borrower1.addBook(library);
        assertEquals(1, borrower1.numberBorrowed());
        assertEquals(1, library.countBooks());
    }


}
