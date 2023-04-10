package overloding_constructor;

public class OlTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("naim","male");
        teacher2.displayInformation();
        Teacher teacher3 = new Teacher("ahammed","male", 01747);
        teacher3.displayInformation();
    }
}
