
public class Contact {
    // Final because ID should never change
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phone; 
	private String address;
	
    // Constructor with all the fields
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
    	// Checking the ID
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Contact ID can't be null and must be 10 characters max.");
        }
        // First name check
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name is required and can't be longer than 10 characters.");
        }
        // Last name check
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name is required and can't be longer than 10 characters.");
        }
        // Phone must be exactly 10 digits (no dashes or formatting)
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Phone number must be exactly 10 digits.");
        }
        // Address check
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address is required and can’t be longer than 30 characters.");
        }

        // Assigning values
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Only getter for contactId because it shouldn't change
    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name must not be null or longer than 10 characters.");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name must not be null or longer than 10 characters.");
        }
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Phone must be exactly 10 digits.");
        }
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address must not be null or more than 30 characters.");
        }
        this.address = address;
    }
}