package creational.singleton.lazystyle.doublechecklock;


public class Singleton {

    // volatile禁止指令重排序,保证实例的完全初始化
    private static volatile Singleton instance;

    // 私有构造方法
    private Singleton() {
    }

    /**
     * 双重检查锁解决多线程情况下创建多个实例的问题
     * 举例: 线程1给instance赋值 -> instance!=null -> 线程2刚好进入 -> 直接返回未初始化的对象
     */
    public static Singleton getInstance() {
        // 快速检查instance是否已经初始化,避免不必要的同步开销
        if (instance == null) {
            synchronized (Singleton.class) {
                // 防止多个线程进入同步块创建多个实例
                if (instance == null) {
                    // 指令重排序: 赋值 -> 实例初始化
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
