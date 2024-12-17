package creational.factorymethod;

/**
 * 具体工厂-拿铁咖啡工厂
 *
 * @author tianxing
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee build() {
        return new LatteCoffee();
    }
}
