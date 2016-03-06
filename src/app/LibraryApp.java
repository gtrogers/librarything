package app;

import app.io.Input;
import app.io.LibraryInput;
import app.io.LibraryOutput;
import app.io.Output;

import java.util.Objects;

public class LibraryApp {
    private Input input;
    private Output output;

    public LibraryApp(Output output, Input input) {
        this.output = output;
        this.input = input;
    }

    public void start() {
        boolean running = true;
        String inputLine;

        this.output.out("Welcome to the library thing!");
        this.output.out("\t0\tExit");

        while(running) {
            inputLine = this.input.nextInput();
            if (Objects.equals(inputLine, "0")) {
                running = false;
            }
        }

        this.exit();
    }

    private void exit() {
        this.output.out("Goodbye");
    }

    public static void main(String[] args) {
        LibraryInput input = new LibraryInput();
        LibraryOutput output = new LibraryOutput();

        LibraryApp app = new LibraryApp(output, input);
        app.start();
    }
}
