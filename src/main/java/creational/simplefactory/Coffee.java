package creational.simplefactory;

/**
 * 抽象产品-咖啡
 */
public abstract class Coffee {

    public abstract String getName();


    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加奶");
    }
}
