public class Teacher {

    String name, gender;
    double phone;


    Teacher(){
        System.out.println("no prameater");
    }

    Teacher(String n, String g, double p){
        name = n;
        gender = g;
        phone = p;
    }

    void displayInfarmatoion() {
        System.out.println("Name : "+name);
        System.out.println("gender : "+gender);
        System.out.println("phone : "+phone);
        System.out.println("\n");

    }



}
