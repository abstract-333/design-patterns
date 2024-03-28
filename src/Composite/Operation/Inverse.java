
package Composite.Operation;

public class Inverse extends Operation {
    private Value value;

    public Inverse(Value value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return -1 * this.value.evaluate();
    }

}