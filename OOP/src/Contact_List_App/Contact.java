package Contact_List_App;

public class Contact {

    //All properties
    private String name;
    private String phoneNo;
    private String email;

    //contractor two Parameters
    public Contact(String name, String phoneNo ){
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = null;
    }

    //contractor three Parameters
    public Contact(String name, String phoneNo, String email ){
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }


    //generate......... Getter
    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }


    //generate....... to string
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
