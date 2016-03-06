package app;

import app.io.StubInput;
import app.io.StubOutput;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testPrintsStartMessage() {
        // Given
        StubOutput stubOutput = new StubOutput();
        StubInput stubInput = new StubInput();
        stubInput.addInput("0");
        LibraryApp app = new LibraryApp(stubOutput, stubInput);

        // When
        app.start();
        String lastMessage = stubOutput.getLastMessage();

        // Then
        assertEquals("Welcome to the library thing!", stubOutput.getLine(0));
        assertEquals("\t0\tExit", stubOutput.getLine(1));
        assertEquals("Goodbye", lastMessage);
    }
}
