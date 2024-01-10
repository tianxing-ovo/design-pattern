package 创建型模式.单例模式.饿汉式.静态成员变量;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance() == Singleton.getInstance());//true
    }
}
