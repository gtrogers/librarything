package app.io;

public class Command {
    private String command;
    private String number;

    public Command(String command, String number) {
        this.command = command;
        this.number = number;
    }

    public String commandDescription() {
        return "\t" + this.number + "\t" + this.command;
    }

    public String commandNumber() {
        return this.number;
    }
}
