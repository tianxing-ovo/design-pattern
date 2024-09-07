package structural.proxy.staticproxy;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        System.out.println(proxy.request());
    }
}