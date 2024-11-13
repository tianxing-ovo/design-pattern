package creational.singleton.lazystyle.staticinnerclass;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        // true
        System.out.println(Singleton.getInstance() == Singleton.getInstance());
    }
}
