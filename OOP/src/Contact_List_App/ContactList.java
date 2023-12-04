package Contact_List_App;

import java.util.ArrayList;

public class ContactList {

//    Contact[] contact = new Contact[100];

    //create ArrayList
    private ArrayList<Contact> contacts;

    // objet for contractor
    public ContactList(){
        contacts = new ArrayList<>();

    }

    //method
    public void createContact(Contact contact){
        contacts.add(contact);
    }

    //generate......... to string
    @Override
    public String toString() {
        return "ContactList{" +
                "contacts=" + contacts +
                '}';
    }

    //method class getTotalContact size
    public int getTotalContact(){
        return contacts.size();
    }

    //method delete contact
    public  void removeContact(int index){
        contacts.remove(index);
    }

    //method search contact
    public Contact searchContact(String name){
        for (Contact contact : contacts){
            if(contact.getName().equalsIgnoreCase(name)){
                return contact;
            }
        }
        return null;
    }



}
