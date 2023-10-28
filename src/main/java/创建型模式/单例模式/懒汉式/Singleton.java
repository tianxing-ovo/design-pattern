package 创建型模式.单例模式.懒汉式;


public class Singleton {
    // 私有构造方法
    private Singleton() {
    }

    private static Singleton instance;

    /**
     * 使用synchronized解决多线程情况下创建多个实例的问题
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            // 线程1等待,线程2也会进入该判断
            instance = new Singleton();
        }
        return instance;
    }
}
