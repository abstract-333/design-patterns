package Composite.Operation;

public class Multiply extends Operation {
    private Operation leftValue;
    private Operation rightValue;

    public Multiply(Operation leftValue, Operation rightValue) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    @Override
    public double evaluate() {
        return leftValue.evaluate() * rightValue.evaluate();
    }

}
