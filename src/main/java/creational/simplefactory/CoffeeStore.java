package creational.simplefactory;

/**
 * 咖啡店
 */
public class CoffeeStore {

    /**
     * 点咖啡
     */
    public static Coffee orderCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.build(type);
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
