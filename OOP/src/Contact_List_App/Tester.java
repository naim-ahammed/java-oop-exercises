package Contact_List_App;

public class Tester {

//    Contact List app
//    we can create new contact
    // we can view list of contact
    // search contact
    // delete contact
    // contact = name, email, phone
    // contact Array
    // insert , search, delete

    public static void main(String[] args) {

        Contact contact1 = new Contact("Naim","01567870631");
        System.out.println("contact1 = "+ contact1);

        Contact contact2 = new Contact("Faisal","0156734244", "faisal@gamil.com");
        System.out.println("contact2 = "+ contact2);

        ContactList contactList = new ContactList();
        contactList.createContact(contact1);
        contactList.createContact(contact2);


        System.out.println("Contact List = "+ contactList);
        System.out.println("Total Contact Size = "+ contactList.getTotalContact());

        contactList.removeContact(1);
        System.out.println("Remove Contact = "+contactList);

        Contact searchContact = contactList.searchContact("Naim");
        if(searchContact != null){
            System.out.println("Search Contact Name = "+searchContact);
        }else {
            System.out.println("Contact Not Found");
        }

    }




}
