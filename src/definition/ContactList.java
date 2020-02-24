package definition;

import adt.ContactListADT;

public class ContactList implements ContactListADT<Person> {

    private Node head = null;
    private int size = 0;

    @Override
    public void add(Person data) {

            Node node=new Node( data);

            if(head==null){
                head=node;
            }
            else {
                Node temp=head;
                while(temp.getNext()!=null){
                    temp=temp.getNext();
                }
                temp.setNext( node );
            }
            System.out.println("contact added successfully");



    }

    @Override
    public void remove(int item) {

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

    }

    private static   class Node {
        private Person data;
        private Node next;
        public Node(Person data){
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
