package creational.singleton.lazystyle.staticinnerclass;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance()==Singleton.getInstance()); // true
    }
}
