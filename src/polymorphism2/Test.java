package polymorphism2;

public class Test {
    public static void main(String[] args) {

        Shape s = new Shape();
        Raotangle r = new Raotangle(10,20);
        Triangle t = new Triangle(10, 20);

        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());

    }
}
