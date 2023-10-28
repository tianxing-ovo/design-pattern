package 创建型模式.简单工厂模式;

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
