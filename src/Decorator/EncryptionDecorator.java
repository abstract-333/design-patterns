package Decorator;

public class EncryptionDecorator extends Decorator {

    public EncryptionDecorator(IMessage wrapee) {
        super(wrapee);
    }

    @Override
    public void send() {
        System.out.println(getClass());
        super.send();
    }

}
