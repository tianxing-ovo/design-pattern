package 创建型模式.工厂方法模式;

/**
 * 具体工厂-美式咖啡工厂
 */
public class AmericanCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee build() {
        return new AmericanCoffee();
    }
}
