package Decorator;

public class CompressionDecorator extends Decorator {

    public CompressionDecorator(IMessage wrapee) {
        super(wrapee);
    }

    @Override
    public void send() {
        System.out.println(getClass());
        super.send();
    }
}
