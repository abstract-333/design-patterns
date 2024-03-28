package Composite.Operation;

public class Add extends Operation {
    private Operation rightValue;
    private Operation leftValue;

    public Add(Operation rightValue, Operation leftValue) {
        this.rightValue = rightValue;
        this.leftValue = leftValue;
    }

    @Override
    public double evaluate() {
        return leftValue.evaluate() + rightValue.evaluate();
    }

}
