package Section_10_List_ArrayList_LinkedList_Iterator_Autoboxing.CodingExercise45;

import java.util.ArrayList;


class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact.getName());
        if (position >= 0) {
            myContacts.set(position, newContact);
            System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
            return true;
        }
        System.out.println(oldContact.getName() + " was not found.");
        return false;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact.getName());
        if (position >= 0) {
            myContacts.remove(position);
            System.out.println(contact.getName() + " was deleted.");
            return true;
        }
        System.out.println(contact.getName() + " was not found.");
        return false;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}