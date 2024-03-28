package Composite.PhoneContact;

abstract public class PhoneContact {
    private String name;

    public PhoneContact(String name) {
        this.name = name;
    }

    public abstract void send(String message);
}
