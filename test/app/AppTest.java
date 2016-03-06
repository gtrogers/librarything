package app;

import app.io.StubOutput;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testPrintsStartMessage() {
        // Given
        StubOutput stubOutput = new StubOutput();
        LibraryApp app = new LibraryApp(stubOutput);

        // When
        app.start();
        String lastMessage = stubOutput.getLastMessage();

        // Then
        assertEquals("Welcome to the library thing!", lastMessage);
    }
}
