package creational.singleton.hungrystyle.staticblock;

/**
 * 静态代码块
 */
public class Singleton {
    private static final Singleton INSTANCE;

    static {
        INSTANCE = new Singleton();
    }

    // 私有构造方法
    private Singleton() {

    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
