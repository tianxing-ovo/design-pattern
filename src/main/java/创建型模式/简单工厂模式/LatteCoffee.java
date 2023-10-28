package 创建型模式.简单工厂模式;

/**
 * 具体产品-拿铁咖啡
 */
public class LatteCoffee extends Coffee {
    @Override
    public String getName() {
        return "拿铁咖啡";
    }
}
