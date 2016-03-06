package app.io;

import java.util.ArrayList;

public class StubOutput implements Output {

    private ArrayList<String> messages;

    public StubOutput() {
        this.messages = new ArrayList<>();
    }

    @Override
    public void out(String message) {
        this.messages.add(message);
    }

    public String getLastMessage() {
        return this.messages.get(this.messages.size() - 1);
    }

    public String getLine(int n) {
        try {
            return this.messages.get(n);
        } catch(IndexOutOfBoundsException e) {
            System.err.println("No input for line " + n);
            return null;
        }
    }
}
