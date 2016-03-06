package app;

import app.io.StubInput;
import app.io.StubOutput;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        assertTrue(stubOutput.containsMessage("Welcome to the library thing!"));
        assertTrue(stubOutput.containsMessage("\t0\tExit"));
        assertEquals("Goodbye", lastMessage);
    }
}
