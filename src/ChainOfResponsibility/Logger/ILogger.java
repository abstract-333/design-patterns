package ChainOfResponsibility.Logger;

public interface ILogger {

    public void setNext(ILogger next);

    public void log(IMessage message);
}
