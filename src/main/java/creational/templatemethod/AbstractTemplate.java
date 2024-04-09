package creational.templatemethod;

/**
 * 抽象模板类
 */
public abstract class AbstractTemplate {

    /**
     * 模板方法(Template Method): 定义算法的骨架
     */
    public final void templateMethod() {
        abstractMethod();
        concreteMethod();
        hookMethod();
    }

    /**
     * 抽象方法(Abstract Method): 子类根据自己的特性提供具体实现
     */
    public abstract void abstractMethod();

    /**
     * 具体方法(Concrete Method): 通用的代码
     */
    private void concreteMethod() {
        System.out.println("具体方法");
    }

    /**
     * 钩子方法(Hook Method): 子类可选择覆盖
     */
    protected void hookMethod() {
    }
}
