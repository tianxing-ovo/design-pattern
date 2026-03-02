package creational.singleton.hungrystyle.staticblock;

/**
 * @author tianxing
 */
public class Client {

    public static void main(String[] args) {
        // true
        System.out.println(Singleton.getInstance() == Singleton.getInstance());
    }
}
