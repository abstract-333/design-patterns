package Decorator;

public class Message implements IMessage {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void send() {
        System.out.println("Send message" + this.text);
    }
}
