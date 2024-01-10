package 创建型模式.单例模式.饿汉式.静态成员变量;

/**
 * 静态成员变量
 */
public class Singleton {

    //私有构造方法
    private Singleton() {
    }

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
