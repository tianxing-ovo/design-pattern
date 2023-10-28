package 创建型模式.单例模式.饿汉式.枚举;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE==Singleton.INSTANCE);//true
    }
}
