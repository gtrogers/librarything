package app;

import app.io.Command;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandTest {
    @Test
    public void testCommandDescription() {
        // Given
        Command command = new Command("Test Command", "99");

        // When
        String commandDescription = command.commandDescription();
        String commandNumber = command.commandNumber();

        // Then
        assertEquals("\t99\tTest Command", commandDescription);
        assertEquals("99", commandNumber);
    }
}
