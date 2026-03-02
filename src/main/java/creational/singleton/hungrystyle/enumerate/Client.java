package creational.singleton.hungrystyle.enumerate;

/**
 * 客户端
 *
 * @author tianxing
 */
public class Client {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;
        // true
        System.out.println(s1 == s2);
    }
}