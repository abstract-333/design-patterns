package Decorator;

public class Main {
    public static void main(String[] args) throws Exception {
        IMessage encryptedMessage = new EncryptionDecorator(new Message("First Message"));
        ;
        encryptedMessage.send();

        IMessage compressedEncryptedMessage = new CompressionDecorator(
                new EncryptionDecorator(new Message("First Message")));
        ;
        compressedEncryptedMessage.send();

    }
}
