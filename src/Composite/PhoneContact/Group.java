package Composite.PhoneContact;

import java.util.ArrayList;

public class Group extends PhoneContact {
    ArrayList<PhoneContact> listOfPhoneContacts;

    public Group(String name) {
        super(name);
        this.listOfPhoneContacts = new ArrayList<PhoneContact>();
    }

    @Override
    public void send(String message) {
        for (PhoneContact phoneContact : listOfPhoneContacts) {
            phoneContact.send(message);
        }
    }

    public void add(PhoneContact phoneContact) {
        listOfPhoneContacts.add(phoneContact);
    }

}
