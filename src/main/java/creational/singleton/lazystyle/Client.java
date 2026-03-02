package creational.singleton.lazystyle;

/**
 * 客户端
 *
 * @author tianxing
 */
public class Client {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // true
        System.out.println(Singleton.getInstance() == Singleton.getInstance());
    }
}
