package creational.singleton.hungrystyle.enumerate;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        // true
        System.out.println(Singleton.INSTANCE == Singleton.INSTANCE);
    }
}
