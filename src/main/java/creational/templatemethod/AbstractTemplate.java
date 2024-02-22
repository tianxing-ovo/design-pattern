package creational.templatemethod;

/**
 * 抽象模板类(包括模板方法,抽象/基本方法,具体方法,钩子方法)
 */
public abstract class AbstractTemplate {

    /**
     * 模板方法
     */
    public final void cook() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
        hookMethod();
    }

    /**
     * 具体方法
     */
    public void pourOil() {
        System.out.println("倒油");
    }

    /**
     * 具体方法
     */
    public void heatOil() {
        System.out.println("热油");
    }

    /**
     * 具体方法
     */
    public void fry() {
        System.out.println("翻炒");
    }

    /**
     * 倒蔬菜(抽象方法)
     */
    public abstract void pourVegetable();

    /**
     * 放调料(抽象方法)
     */
    public abstract void pourSauce();

    /**
     * 钩子方法,子类可选择覆盖
     */
    protected void hookMethod() {
    }
}
