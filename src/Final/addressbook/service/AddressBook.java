package Final.addressbook.service;

import Final.addressbook.model.Contact;

public class AddressBook {
    private final Contact[] contacts = new Contact[100];

    public void addContact(Contact contact) {
        System.out.println("Введите Фамилию");
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                break;
            }
        }
    }
}

//    public void removeContact() { ... }
//    public void listAllContacts() { ... }

