package Composite.Operation;

public class Main {
    public static void main(String[] args) throws Exception {

        Value tenValue = new Value(10);
        Value fiveValue = new Value(5);
        Value threeValue = new Value(3);

        Operation minusThreeOperation = new Inverse(threeValue);
        Operation divideOperation = new Divide(minusThreeOperation, threeValue);
        Operation addOperation = new Add(tenValue, fiveValue);
        Operation multiplyOperation = new Multiply(addOperation, divideOperation);

        System.out.println(divideOperation.evaluate());
        System.out.println(addOperation.evaluate());
        System.out.println(multiplyOperation.evaluate());
    }
}
