import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    private ContactService contactService;

    @BeforeEach
    void setUp() {
        contactService = new ContactService();
    }

    @Test
    void testAddContactSuccess() {
        Contact contact = new Contact("1234", "Nick", "Liousas", "12 Elm St", "5616998563");
        assertTrue(contactService.addContact(contact));
    }

    @Test
    void testAddContactDuplicateIdFails() {
        Contact contact1 = new Contact("1234", "Nick", "Liousas", "12 Elm St", "5616998563");
        Contact contact2 = new Contact("1234", "John", "Doe", "34 Oak St", "4802929112");

        assertTrue(contactService.addContact(contact1));
        assertFalse(contactService.addContact(contact2));
    }

    @Test
    void testDeleteContactSuccess() {
        Contact contact = new Contact("5678", "Omar", "Toledo", "789 Pine St", "5613665975");
        contactService.addContact(contact);

        assertTrue(contactService.deleteContact("5678"));
    }

    @Test
    void testDeleteContactFailsForInvalidId() {
        assertFalse(contactService.deleteContact("9999"));
    }

    @Test
    void testUpdateFirstNameSuccess() {
        Contact contact = new Contact("0001", "Sam", "Smith", "123 Road", "1234567890");
        contactService.addContact(contact);

        assertTrue(contactService.updateFirstName("0001", "Alex"));
    }

    @Test
    void testUpdatePhoneFailsForInvalidId() {
        assertFalse(contactService.updatePhone("9999", "9876543210"));
    }

    @Test
    void testUpdateLastNameSuccess() {
        Contact contact = new Contact("7777", "Lisa", "Wong", "500 Maple", "2223334444");
        contactService.addContact(contact);

        assertTrue(contactService.updateLastName("7777", "Brown"));
    }

    @Test
    void testUpdateAddressSuccess() {
        Contact contact = new Contact("8888", "Mike", "Tyson", "Old St", "9998887777");
        contactService.addContact(contact);

        assertTrue(contactService.updateAddress("8888", "New Street 55"));
    }
}
