import java.util.ArrayList;

public class ContactService {

    // This list will hold the contacts
    private ArrayList<Contact> contacts;

    // Set up the contact list
    public ContactService() {
        contacts = new ArrayList<>();
    }

    // New contact
    public boolean addContact(Contact newContact) {
        // Make sure the contact ID is unique
        for (Contact contact : contacts) {
            if (contact.getContactId().equals(newContact.getContactId())) {
                // ID already exists, so we don't add it
                return false;
            }
        }

        // If the ID was unique, then we add the contact
        contacts.add(newContact);
        return true;
    }

    // This deletes a contact using their ID
    public boolean deleteContact(String contactId) {
        for (Contact contact : contacts) {
            if (contact.getContactId().equals(contactId)) {
                contacts.remove(contact); // found and removed
                return true;
            }
        }
        // If we didn’t find it
        return false;
    }

    // This updates the first name (if the contact exists)
    public boolean updateFirstName(String contactId, String newFirstName) {
        for (Contact contact : contacts) {
            if (contact.getContactId().equals(contactId)) {
                contact.setFirstName(newFirstName); // uses the setter from Contact.java
                return true;
            }
        }
        return false;
    }

    // This updates the last name
    public boolean updateLastName(String contactId, String newLastName) {
        for (Contact contact : contacts) {
            if (contact.getContactId().equals(contactId)) {
                contact.setLastName(newLastName);
                return true;
            }
        }
        return false;
    }

    // This updates the phone number
    public boolean updatePhone(String contactId, String newPhone) {
        for (Contact contact : contacts) {
            if (contact.getContactId().equals(contactId)) {
                contact.setPhone(newPhone);
                return true;
            }
        }
        return false;
    }

    // This updates the address
    public boolean updateAddress(String contactId, String newAddress) {
        for (Contact contact : contacts) {
            if (contact.getContactId().equals(contactId)) {
                contact.setAddress(newAddress);
                return true;
            }
        }
        return false;
    }
}
