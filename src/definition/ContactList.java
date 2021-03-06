package definition;

import adt.ContactListADT;

import java.util.Scanner;

public class ContactList implements ContactListADT<Person> {
    Scanner ob = new Scanner(System.in);

    private Node head = null;
    private int size = 0;

    @Override
    public void add(Person data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        System.out.println("contact added successfully");


    }

    public void sortList() {
        //Node current will point to head
        Node current = head, index = null;
        Person temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                //Node index will point to node next to current
                index = current.getNext();

                while (index != null) {
                    //If current node's data is greater than index's node data, swap the data between them
                    if (current.getData().getFirstName().compareTo(index.getData().getFirstName()) > 0) {
                        temp = current.getData();
                        current.setData(index.getData());
                        index.setData(temp);
                    }
                    index = index.getNext();
                }
                current = current.getNext();
            }
        }
    }

    @Override
    public void remove(int item) {

        Node temp = head;
        Node previous = null;
        String result = "";
        if (item == 1) {
            result = (String) (temp.getData().getFirstName() + " " + temp.getData().getLastName());
            System.out.println(result + "'s contact deleted from list!");
            head = temp.getNext();
            temp = head;
        } else {
            try {
                for (int i = 1; i <= size; i++) {
                    if (i == item) {
                        result = (String) (temp.getData().getFirstName() + " " + temp.getData().getLastName());
                        System.out.println(result + "'s contact deleted from list!");
                        previous.setNext(temp.getNext());
                        size--;
                        break;
                    }
                    previous = temp;
                    temp = temp.getNext();
                }
            } catch (NullPointerException e) {
                System.out.println("Contact List is Empty!");
            }
        }
    }

    @Override
    public void search(String name) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.getData().getFirstName().equals(name))
                count++;

            temp = temp.getNext();
        }
        if (count != 0)
            System.out.println(count + " match found!\n-------- * -------- * -------- * --------");
        else
            System.out.println("No Result Found.");
    }


    @Override
    public void view() {

sortList();
        System.out.println("---Here are all your contacts---\n" + "-------- * -------- * -------- * --------");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
            System.out.println("-------- * -------- * -------- * --------" + "\n" + "-------- * -------- * -------- * --------");
        }
        System.out.println();
    }

    public void printList() {
        sortList();
        System.out.println("Here are all your contacts: ");
        Node temp = head;
        int i = 1;
        while (temp != null) {
            System.out.println(i++ + ". " + temp.getData().getFirstName() + " " + temp.getData().getLastName());
            temp = temp.getNext();

        }
    }


    private static class Node {
        private Person data;
        private Node next;

        public Node(Person data) {
            this.data = data;
            next = null;
        }

        public Person getData() {
            return data;
        }

        public void setData(Person data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}


