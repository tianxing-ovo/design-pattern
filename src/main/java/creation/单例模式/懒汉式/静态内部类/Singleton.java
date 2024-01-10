package 创建型模式.单例模式.懒汉式.静态内部类;

public class Singleton {
    //私有构造方法
    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    /**
     * 反序列化时调用该方法,防止序列化破坏单例模式
     */
    public Object readResolve() {
        return SingletonHolder.instance;
    }
}
