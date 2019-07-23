import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;

    @Before
    public void before() {
        book1 = new Book("Fight Club", "Geoff Palladnuik", "fiction");
        book2 = new Book("The Life of Pi", "Some Guy", "fiction");
        book3 = new Book("Learn to Program", "Chris Pine", "Educational");
        library = new Library(2);
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

    @Test
    public void canAddBookBecauseNotFull() {
        assertEquals(true, library.canAddBook());
    }

    @Test
    public void cannotAddBookBecauseFull() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(false, library.canAddBook());
    }

    @Test
    public void canOnlyAddBooksToLibraryUntilFull() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.countBooks());
    }
}
