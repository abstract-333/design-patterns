package Composite.Operation;

abstract public class Operation {
    public abstract double evaluate();

    @Override
    public String toString() {
        return Double.toString(this.evaluate());
    }
}
