package Project0122;

import java.io.Serializable;

public class PhoneContact implements Serializable {
    String firstName;
    String lastName;
    String phoneNumber;
    String Email;
    final static long serialVersionUID = 1L;

    public PhoneContact(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.Email = email;
    }
}
