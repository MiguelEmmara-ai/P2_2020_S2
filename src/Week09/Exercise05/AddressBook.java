package Week09.Exercise05;

import java.util.HashMap;

/**
 * Created by Miguel Emmara
 */
public class AddressBook {
    private HashMap<String,ContactDetails> contacts;

    public AddressBook() {
        contacts = new HashMap<String,ContactDetails>();
    }

    public HashMap<String, ContactDetails> getContacts() {
        return contacts;
    }

    public void setContacts(HashMap<String, ContactDetails> contacts) {
        this.contacts = contacts;
    }

    void store(ContactDetails contactDetails) {
        contacts.put(contactDetails.getLast_name(),contactDetails);
    }

    ContactDetails lookup(String lastname) {
        for (String str : contacts.keySet()) {
            if (str.equalsIgnoreCase(lastname)) {
                return contacts.get(str);
            }
        }

        ContactDetails contactDetails = null;
        return contactDetails;
    }
}
