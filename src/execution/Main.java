package execution;

import definition.ContactList;
import definition.MaintainContactList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        ContactList conts = new ContactList();
        MaintainContactList sc = new MaintainContactList();

        while (true) {
            System.out.println("Welcome to Shagun's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program");

            int choice = ob.nextInt();
            ob.nextLine();
            switch(choice) {
                case 1:
                    conts.add(sc.addContact());
                    break;
                case 2:
                    conts.view();
                    break;

                case 3:
                    conts.search(ob.nextLine());
                    break;
                case 4:
                    conts.printList();
                    System.out.println("Press the number against the contact to delete it!");
                    int c=ob.nextInt();
                  conts.remove(c);
                  break;
                case 5:
                    System.exit(0);
                  break;
            }
        }
    }
}