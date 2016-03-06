package app;

import app.io.Output;

public class LibraryApp {
    private Output output;

    public LibraryApp(Output output) {
        this.output = output;
    }

    public void start() {
        this.output.out("Welcome to the library thing!");
    }
}
