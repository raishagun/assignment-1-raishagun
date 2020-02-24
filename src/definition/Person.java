package definition;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private ArrayList<Long> contacts;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Long> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Long> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        if (getContacts().size() == 1) {

            return "First Name=" + getFirstName() + "\n" +
                    "LastName=" + getLastName() + "\n" +
                    "Contact Number=" + getContacts().get(0) +
                    "Email=" + getEmail();

        } else {
            return
                    "FirstName=" + getFirstName() + "\n" +
                            " LastName=" + getLastName() + "\n" +
                            " Contact Number(s)=" + getContacts() +
                            " email='" + getEmail() + "\n"
                    ;
        }


    }
}
