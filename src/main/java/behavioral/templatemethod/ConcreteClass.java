package behavioral.templatemethod;

/**
 * Concrete Class(具体子类)
 */
public class ConcreteClass extends AbstractClass {

    /**
     * 实现抽象方法
     */
    @Override
    public void abstractMethod() {
        System.out.println("抽象方法");
    }

    /**
     * 覆盖第一种钩子方法
     */
    @Override
    protected boolean isPrint() {
        return true;
    }

    /**
     * 覆盖第二种钩子方法
     */
    @Override
    protected void hookMethod() {
        System.out.println("第二种钩子方法");
    }
}
