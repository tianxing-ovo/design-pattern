package creational.templatemethod;

/**
 * 具体模板类
 */
public class ConcreteTemplate extends AbstractTemplate {
    @Override
    public void abstractMethod() {
        System.out.println("抽象方法");
    }

    @Override
    protected void hookMethod() {
        System.out.println("钩子方法");
    }
}
