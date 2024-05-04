package Mediator;

public abstract class User {
    protected IChatMediator mediator;
    protected String name;

    public User(IChatMediator mediater, String name) {
        this.mediator = mediater;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}