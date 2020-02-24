package definition;

import java.util.ArrayList;
import java.util.Scanner;

public class MaintainContactList {
    private ContactList contacts;

    Scanner ob = new Scanner(System.in);
    public Person addContact() {
        Person pers = new Person();
        System.out.println("You have chosen to add a new contact:");
        System.out.println(" Please enter the name of the Person");
        System.out.println("First Name");
        String s = ob.nextLine();
        pers.setFirstName(s);
        System.out.println("Last Name");

        String l = ob.nextLine();
        pers.setLastName(l);
        System.out.println("Enter contact");

        ArrayList<Long> number = new ArrayList<>();
        while (true) {
            System.out.print("Number:");
            number.add(ob.nextLong());
            System.out.println("continue to enter number (y/n)");
            ob.nextLine();
            String choice = ob.nextLine();
            if (choice.equals("n"))
                break;
        }
        pers.setContacts(number);
        System.out.println("enter email");
        String email = ob.nextLine();
        pers.setEmail(email);
        return pers;
    }


}
