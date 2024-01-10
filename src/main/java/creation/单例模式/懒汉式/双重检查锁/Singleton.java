package 创建型模式.单例模式.懒汉式.双重检查锁;


public class Singleton {

    // 私有构造方法
    private Singleton() {
    }

    private static volatile Singleton instance;//volatile禁止指令重排序,保证实例的完全初始化

    /**
     * 双重检查锁解决多线程情况下创建多个实例的问题
     * 举例:线程1给instance赋值->instance!=null->线程2刚好进入->直接返回未初始化的对象
     */
    public static Singleton getInstance() {
        if (instance == null) {
            //线程1等待,线程2也会进入该判断
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(); // 指令重排序,赋值->实例初始化
                }
            }
        }
        return instance;
    }
}
