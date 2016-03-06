package app.io;

import java.util.ArrayList;

public class StubInput implements Input {
    private ArrayList<String> inputs;

    public StubInput() {
        this.inputs = new ArrayList<>();
    }

    @Override
    public String nextInput() {
        int remainingInputs = this.inputs.size() - 1;
        String nextInput = null;

        if (remainingInputs >= 0) {
            nextInput = this.inputs.get(remainingInputs);
        }

        if (remainingInputs >= 0) {
            this.inputs.remove(remainingInputs);
        }

        return nextInput;
    }

    public void addInput(String message) {
        this.inputs.add(message);
    }
}
