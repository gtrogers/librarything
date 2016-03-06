package app;

import app.io.Output;
import app.items.Book;

import java.util.ArrayList;

public class Catalogue {

    private ArrayList<Book> bookList;

    public Catalogue() {
        this.bookList = new ArrayList<>();
    }

    public void addItem(Book book) {
        this.bookList.add(book);
    }

    public void outputCatalogue(Output output) {
        for (Book book: bookList) {
            output.out(book.description());
        }
    }
}
