package 创建型模式.简单工厂模式;

/**
 * 简单咖啡工厂
 */
public class SimpleCoffeeFactory {

    public static Coffee build(String type) {
        if ("american".equals(type)) {
            return new AmericanCoffee();
        } else if ("latte".equals(type)) {
            return new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您点的咖啡没有");
        }
    }
}
