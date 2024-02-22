package creational.templatemethod;

/**
 * 具体模板类
 */
public class ConcreteTemplate extends AbstractTemplate {
    @Override
    public void pourVegetable() {
        System.out.println("倒包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("放辣椒");
    }

    @Override
    protected void hookMethod() {
        System.out.println("钩子方法");
    }
}
