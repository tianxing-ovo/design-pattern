package 创建型模式.工厂方法模式;

/**
 * 具体工厂-拿铁咖啡工厂
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee build() {
        return new LatteCoffee();
    }
}
