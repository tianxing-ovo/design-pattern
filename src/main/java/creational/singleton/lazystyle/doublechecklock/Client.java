package creational.singleton.lazystyle.doublechecklock;

/**
 * @author tianxing
 */
public class Client {
    public static void main(String[] args) {
        // true
        System.out.println(Singleton.getInstance() == Singleton.getInstance());
    }
}
