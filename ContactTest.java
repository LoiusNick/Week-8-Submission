import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    void testCreateContactSuccess() {
        Contact contact = new Contact("123456", "Nick", "Liousas", "123 Main St", "5616998563");

        assertNotNull(contact);
        assertEquals("123456", contact.getContactId());
        assertEquals("Nick", contact.getFirstName());
        assertEquals("Liousas", contact.getLastName());
        assertEquals("123 Main St", contact.getAddress());
        assertEquals("5616998563", contact.getPhone());
    }

    @Test
    void testCreateContactIdTooLongFails() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Nick", "Liousas", "123 Main St", "5616998563");
        });
    }

    @Test
    void testCreateContactFirstNameTooLongFails() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123456", "NicholasTooLong", "Liousas", "123 Main St", "5616998563");
        });
    }

    @Test
    void testCreateContactLastNameTooLongFails() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123456", "Nick", "LastNameWayTooLong", "123 Main St", "5616998563");
        });
    }

    @Test
    void testCreateContactAddressTooLongFails() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123456", "Nick", "Liousas", "This address is way longer than thirty characters allowed", "5616998563");
        });
    }

    @Test
    void testCreateContactPhoneTooShortFails() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123456", "Nick", "Liousas", "123 Main St", "1234567");
        });
    }

    @Test
    void testCreateContactPhoneTooLongFails() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123456", "Nick", "Liousas", "123 Main St", "1234567890123");
        });
    }

    @Test
    void testCreateContactPhoneWithLettersFails() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123456", "Nick", "Liousas", "123 Main St", "12345abcde");
        });
    }
}
