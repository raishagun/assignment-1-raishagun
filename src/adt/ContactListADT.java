package adt;

public interface ContactListADT<Person> {
    void add(Person data);
    void remove(int item);
    void search(String name);
    void view();


}
