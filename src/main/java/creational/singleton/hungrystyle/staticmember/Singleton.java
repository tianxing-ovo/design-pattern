package creational.singleton.hungrystyle.staticmember;

/**
 * 静态成员变量
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    // 私有构造方法
    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
