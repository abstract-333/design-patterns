package Decorator;

public class Decorator implements IMessage {
    private IMessage wrapee;

    public Decorator(IMessage wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public void setText(String text) {
        wrapee.setText(text);
    }

    @Override
    public String getText() {
        return wrapee.getText();
    }

    @Override
    public void send() {
        wrapee.send();
    }
}
