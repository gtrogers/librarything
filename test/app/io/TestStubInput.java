package app.io;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStubInput {
    @Test
    public void testInputsArePlayedBack() {
        // Given
        StubInput input = new StubInput();
        input.addInput("Test");

        // When
        String nextLine = input.nextInput();

        // Then
        assertEquals("Test", nextLine);
    }

    @Test
    public void testCanQueueMultipleInputs() {
        // Given
        StubInput input = new StubInput();
        input.addInput("Foo");
        input.addInput("Bar");
        input.addInput("Zap");

        // When
        String inputOne = input.nextInput();
        String inputTwo = input.nextInput();
        String inputThree = input.nextInput();

        // Then
        assertEquals("Foo", inputThree);
        assertEquals("Bar", inputTwo);
        assertEquals("Zap", inputOne);
    }

    @Test
    public void testReturnsNullWhenNoInputs() {
        // Given
        StubInput input = new StubInput();
        input.addInput("Zap");

        // When
        String inputOne = input.nextInput();
        String inputTwo = input.nextInput();

        // Then
        assertEquals("Zap", inputOne);
        assertEquals(null, inputTwo);
    }
}
