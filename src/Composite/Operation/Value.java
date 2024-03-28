package Composite.Operation;

public class Value extends Operation {
    private double value;

    public Value(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }

}
