package creational.singleton.hungrystyle.staticblock;

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
