package ChainOfResponsibility.Logger;

public class MessageLogger implements ILogger {
    private ILogger next;

    public MessageLogger() {
        this.next = null;
    }

    @Override
    public void setNext(ILogger next) {
        this.next = next;
    }

    @Override
    public void log(IMessage message) {
        if (next != null) {
            next.log(message);
        }
    }

}
