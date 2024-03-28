package Composite.Operation;

public class Divide extends Operation {
    private Operation leftValue;
    private Operation rightValue;

    public Divide(Operation leftValue, Operation rightValue) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    @Override
    public double evaluate() {

        if (rightValue.evaluate() == 0)
            throw new ArithmeticException();

        return leftValue.evaluate() / rightValue.evaluate();
    }
}
