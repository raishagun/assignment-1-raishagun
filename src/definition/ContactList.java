package definition;

import adt.ContactListADT;

public class ContactList implements ContactListADT<Person> {

    private Node head=null;
    private int size=0;

    @Override
    public void add(Person data) {

        Node node = new Node(data,head);
        head = node;
        size++;

    }

    @Override
    public void remove(int item) {

    }

    @Override
    public void search(String name) {

    }

    @Override
    public void view() {

    }
    private static   class Node {

        private Person data;
        private Node next;

        public Node(Person data,Node next) {
            this.data = data;
            this. next=null;
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
