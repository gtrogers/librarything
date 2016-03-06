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
}
