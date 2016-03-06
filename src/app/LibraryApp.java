package app;

import app.io.*;

import java.util.Objects;

public class LibraryApp {

    public Command exit = new Command("Exit", "0");
    public Command printCatalogue = new Command("Print Catalogue", "1");

    private Input input;
    private Output output;

    public LibraryApp(Output output, Input input, Catalogue catalogue) {
        this.output = output;
        this.input = input;
    }

    public void start() {
        boolean running = true;
        String inputLine;

        this.output.out("Welcome to the library thing!");
        this.output.out(exit.commandDescription());
        this.output.out(printCatalogue.commandDescription());

        while(running) {
            inputLine = this.input.nextInput();
            if (Objects.equals(inputLine, exit.commandNumber())) {
                running = false;
            }
            if (Objects.equals(inputLine, printCatalogue.commandNumber())) {
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
        Catalogue catalogue = new Catalogue();

        LibraryApp app = new LibraryApp(output, input, catalogue);
        app.start();
    }
}
