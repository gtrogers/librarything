package app;

import app.io.StubInput;
import app.io.StubOutput;
import app.items.Book;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EndToEndAppTest {
    @Test
    public void testPrintsStartMessageAndExits() {
        // Given
        StubOutput stubOutput = new StubOutput();
        StubInput stubInput = new StubInput();
        stubInput.addInput("0");
        Catalogue catalogue = new Catalogue();
        LibraryApp app = new LibraryApp(stubOutput, stubInput, catalogue);

        // When
        app.start();
        String lastMessage = stubOutput.getLastMessage();

        // Then
        assertEquals("Welcome to the library thing!", stubOutput.getLine(0));
        assertEquals("\t0\tExit", stubOutput.getLine(1));
        assertEquals("Goodbye", lastMessage);
    }

    @Test @Ignore
    public void testPrintCatalogue() {
        // Given
        StubOutput stubOutput = new StubOutput();
        StubInput stubInput = new StubInput();
        Catalogue catalogue = new Catalogue();
        catalogue.addItem(new Book("Some Book", "Some Person"));
        stubInput.addInput("1");
        stubInput.addInput("0");
        LibraryApp app = new LibraryApp(stubOutput, stubInput, catalogue);

        // When
        app.start();

        // Then
        assertEquals("Welcome to the library thing!", stubOutput.getLine(0));
        assertEquals("\t1\tPrint Catalogue", stubOutput.getLine(2));
        assertEquals("\t- - Some Book\tSome Person", stubOutput.getLine(3));
        assertEquals("Goodbye", stubOutput.getLastMessage());
    }
}
