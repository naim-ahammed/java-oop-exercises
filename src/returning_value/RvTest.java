package returning_value;

public class RvTest {
    public static void main(String[] args) {
        ReturningValueDemo RV1= new ReturningValueDemo();
        int result = RV1.square(5);

        System.out.println("squre of 5 = "+result);

    }
}
