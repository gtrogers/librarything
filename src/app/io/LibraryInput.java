package app.io;

import java.util.Scanner;

public class LibraryInput implements Input {

    private Scanner scanner;

    public LibraryInput() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String nextInput() {
        return this.scanner.next();
    }
}
