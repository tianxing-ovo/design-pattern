package 创建型模式.单例模式.饿汉式.静态代码块;

/**
 * 静态代码块
 */
public class Singleton {
    //私有构造方法
    private Singleton() {

    }

    private final static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
