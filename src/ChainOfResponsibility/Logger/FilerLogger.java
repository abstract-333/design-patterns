package ChainOfResponsibility.Logger;

import java.io.FileWriter;

public class FilerLogger extends MessageLogger {
    private FileWriter file;

    public FilerLogger(String filePath) {
        this.file = new FileWriter(filePath);
    }

    @Override
    public void log(IMessage message) {

        if (message.getType() == MessageType.ERROR) {
            this.file.write(message.getText());

        } else {
            super.log(message);
        }
    }
}
