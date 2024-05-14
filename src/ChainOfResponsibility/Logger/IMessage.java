package ChainOfResponsibility.Logger;

public class IMessage {
    private MessageType type;
    private String text;

    public IMessage(MessageType type, String text) {
        this.type = type;
        this.text = text;
    }

    public MessageType getType() {
        return type;
    }

    public String getText() {
        return text;
    }
}
