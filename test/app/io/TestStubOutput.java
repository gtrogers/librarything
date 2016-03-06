package app.io;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStubOutput {
    @Test
    public void testStoresLastMessage() {
        // Given
        StubOutput output = new StubOutput();
        output.out("Hello world");

        // When
        String lastMessage = output.getLastMessage();

        // Then
        assertEquals("Hello world", lastMessage);
    }

    @Test
    public void testCheckingForPreviousMessage() {
        // Given
        StubOutput output = new StubOutput();
        output.out("Testing 1...");
        output.out("Testing 2...");
        output.out("Testing 3...");

        // When
        boolean hasMessage = output.containsMessage("Testing 1...");
        boolean noMessage = output.containsMessage("Missing...");

        // Then
        assertEquals(true, hasMessage);
        assertEquals(false, noMessage);
    }
}
