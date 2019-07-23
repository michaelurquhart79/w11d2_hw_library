import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void before() {
        book1 = new Book("Fight Club", "Geoff Palladnuik", "fiction");

    }

    @Test
    public void bookHasTitle() {
        assertEquals("Fight Club", book1.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Geoff Palladnuik", book1.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("fiction", book1.getGenre());
    }

}
