package ChainOfResponsibility.Logger;

public class SocketLogger extends MessageLogger {
    public SocketLogger(int port) {

    }

    @Override
    public void log(IMessage message) {

        if (message.getType() == MessageType.WARNING) {

        } else {
            super.log(message);
        }
    }
}
