import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;
    private Library library;

    @Before
    public void before() {
        book1 = new Book("Fight Club", "Geoff Palladnuik", "fiction");
        book2 = new Book("The Life of Pi", "Some Guy", "fiction");
        library = new Library();
    }

    @Test
    public void libraryInitiallyHasNoBooks() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

}
