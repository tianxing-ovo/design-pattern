package creational.simplefactory;

/**
 * 具体产品-拿铁咖啡
 *
 * @author tianxing
 */
public class LatteCoffee extends Coffee {
    @Override
    public String getName() {
        return CoffeeType.LATTE.getName();
    }
}
