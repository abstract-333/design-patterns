package Composite.PhoneContact;

public class Contact extends PhoneContact {
    private String number;

    public Contact(String name, String number) {
        super(name);
        this.number = number;
    }

    @Override
    public void send(String message) {
        System.out.println(message + " sent to " + number);
    }

}
