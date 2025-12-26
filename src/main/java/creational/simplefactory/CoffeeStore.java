package creational.simplefactory;

/**
 * 咖啡店
 *
 * @author tianxing
 */
public class CoffeeStore {

    /**
     * 点咖啡
     *
     * @param coffeeType 咖啡类型
     * @return 咖啡
     */
    public static Coffee orderCoffee(CoffeeType coffeeType) {
        Coffee coffee = SimpleCoffeeFactory.build(coffeeType);
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
