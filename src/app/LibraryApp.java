package app;

import app.io.*;
import app.items.Book;

import java.util.Objects;

public class LibraryApp {

    public Command exit = new Command("Exit", "0");
    public Command printCatalogue = new Command("Print Catalogue", "1");

    private Catalogue catalogue;
    private Input input;
    private Output output;

    public LibraryApp(Output output, Input input, Catalogue catalogue) {
        this.output = output;
        this.input = input;
        this.catalogue = catalogue;
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
                catalogue.outputCatalogue(this.output);
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

        catalogue.addItem(new Book("The Importance of Being Earnest", "Oscar Wilde"));
        catalogue.addItem(new Book("Consider Phlebas", "Ian M Banks"));

        LibraryApp app = new LibraryApp(output, input, catalogue);
        app.start();
    }
}
