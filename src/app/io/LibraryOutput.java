package app.io;

import app.LibraryApp;

import java.io.PrintStream;

public class LibraryOutput implements Output {

    private PrintStream out;

    public LibraryOutput() {
        this.out = new PrintStream(System.out);
    }

    @Override
    public void out(String message) {
        this.out.println(message);
    }
}
