package Final.addressbook.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;

@Setter
@Getter
public class Contact {
    private String lastName;
    private String firstName;
    private String middleName;
    private String position;
    private LocalDate birthDate;
    private int phoneNumber;
    private String email;

    public Contact(String lastName, String firstName, String middleName, String position,
                   LocalDate birthDate, int phoneNumber, String email) {
        if (lastName == null || firstName == null || middleName == null) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.position = position;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    @Override
    public String toString() {
        return "Contact{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", position='" + position + '\'' +
                ", birthDate=" + birthDate +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;
        return  Objects.equals(lastName, contact.lastName) &&
                Objects.equals(firstName, contact.firstName) &&
                Objects.equals(middleName, contact.middleName);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(lastName);
        result = 31 * result + Objects.hashCode(firstName);
        result = 31 * result + Objects.hashCode(middleName);
        return result;
    }
}
