package 创建型模式.简单工厂模式;

/**
 * 具体产品-美式咖啡
 */
public class AmericanCoffee extends Coffee {
    @Override
    public String getName() {
        return "美式咖啡";
    }
}
