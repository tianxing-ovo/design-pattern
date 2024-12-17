package creational.singleton.lazystyle.staticinnerclass;

/**
 * @author tianxing
 */
public class Singleton {
    // 私有构造方法
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 反序列化时调用该方法,防止序列化破坏单例模式
     */
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
