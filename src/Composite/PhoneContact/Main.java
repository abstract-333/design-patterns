package Composite.PhoneContact;

public class Main {
    public static void main(String[] args) throws Exception {
        PhoneContact firstContact = new Contact("firstContact", "0912321");
        PhoneContact secondContact = new Contact("secondContact", "091232212");
        Group firstGroup = new Group("Group");
        firstGroup.add(firstContact);
        firstGroup.add(secondContact);
        firstGroup.send("Message Testing");

    }
}
