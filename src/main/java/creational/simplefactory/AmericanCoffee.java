package creational.simplefactory;

/**
 * 具体产品-美式咖啡
 *
 * @author tianxing
 */
public class AmericanCoffee extends Coffee {
    @Override
    public String getName() {
        return CoffeeType.AMERICAN.getName();
    }
}
