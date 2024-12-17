package creational.singleton.lazystyle;


/**
 * @author tianxing
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class Singleton {
    private static Singleton instance;

    // 私有构造方法
    private Singleton() {
    }

    /**
     * 使用synchronized解决多线程情况下创建多个实例的问题
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
