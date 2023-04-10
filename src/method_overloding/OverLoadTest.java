package method_overloding;

public class OverLoadTest {
    public static void main(String[] args) {

        OverLoad ol = new OverLoad();
        ol.add();
        ol.add(5,20);
        ol.add(3.55,4.55);
        ol.add(3,4,6);
    }
}
