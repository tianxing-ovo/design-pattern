package creational.factorymethod;

/**
 * 具体工厂-美式咖啡工厂
 */
public class AmericanCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee build() {
        return new AmericanCoffee();
    }
}
