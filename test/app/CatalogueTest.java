package app;

import app.io.StubOutput;
import app.items.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CatalogueTest {
    @Test
    public void testPrintingCatalogue() {
        // Given
        Book mockBook1 = mock(Book.class);
        Book mockBook2 = mock(Book.class);
        when(mockBook1.description()).thenReturn("First Book");
        when(mockBook2.description()).thenReturn("Second Book");

        StubOutput output = new StubOutput();
        Catalogue catalogue = new Catalogue();
        catalogue.addItem(mockBook1);
        catalogue.addItem(mockBook2);

        // When
        catalogue.outputCatalogue(output);

        // Then
        assertEquals("First Book", output.getLine(0));
        assertEquals("Second Book", output.getLine(1));
    }
}
