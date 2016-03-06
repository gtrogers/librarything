import app.items.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void testGettingBookDescription() {
        // Given
        Book book = new Book("Harry Potter and the Philosopher's Stone", "J K Rowling");

        // When
        String desc = book.description();

        // Then
        assertEquals("Harry Potter and the Philosopher's Stone\tJ K Rowling", desc);
    }
}
