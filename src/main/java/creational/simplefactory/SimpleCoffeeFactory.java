package creational.simplefactory;

/**
 * 简单咖啡工厂
 *
 * @author tianxing
 */
public class SimpleCoffeeFactory {

    /**
     * 构建咖啡
     *
     * @param coffeeType 咖啡类型
     * @return 咖啡
     */
    public static Coffee build(CoffeeType coffeeType) {
        if (coffeeType == null) {
            throw new IllegalArgumentException("咖啡类型不能为空");
        }
        switch (coffeeType) {
            case AMERICAN:
                return new AmericanCoffee();
            case LATTE:
                return new LatteCoffee();
            default:
                throw new RuntimeException("对不起，您点的咖啡没有");
        }
    }
}
