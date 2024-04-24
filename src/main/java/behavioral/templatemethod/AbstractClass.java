package behavioral.templatemethod;

/**
 * Abstract Class(抽象类)
 */
public abstract class AbstractClass {

    /**
     * 模板方法(Template Method): 定义算法的骨架
     */
    public final void templateMethod() {
        abstractMethod();
        concreteMethod();
        if (isPrint()){
            System.out.println("第一种钩子方法");
        }
        hookMethod();
    }

    /**
     * 基本方法-抽象方法(Abstract Method): 子类根据自己的特性提供具体实现
     */
    public abstract void abstractMethod();

    /**
     * 基本方法-具体方法(Concrete Method): 通用的代码
     */
    private void concreteMethod() {
        System.out.println("具体方法");
    }

    /**
     * 基本方法-第一种钩子方法(Hook Method): 控制方法的执行
     */
    protected boolean isPrint() {
        return false;
    }

    /**
     * 基本方法-第二种钩子方法(Hook Method): 子类可选择覆盖/继承
     */
    protected void hookMethod() {
    }
}
