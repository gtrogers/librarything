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

    @Test public void testGettingPreviousMessage() {
        // Given
        StubOutput output = new StubOutput();
        output.out("Line one");
        output.out("Line two");
        output.out("Line three");

        // When
        String line1 = output.getLine(0);
        String lineDoesNotExist = output.getLine(99);

        // Then
        assertEquals("Line one", line1);
        assertEquals(null, lineDoesNotExist);
    }
}
