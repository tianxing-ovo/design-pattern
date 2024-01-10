package 结构型模式.代理模式.静态代理;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}