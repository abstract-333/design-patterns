package ChainOfResponsibility.Logger;

public class ConsoleLogger extends MessageLogger {
    @Override
    public void log(IMessage message) {

        if (message.getType() == MessageType.INFO) {
            System.out.println(message.getText());
        } else {
            super.log(message);
        }
    }
}
