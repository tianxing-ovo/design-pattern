package creational.factorymethod;

import lombok.AllArgsConstructor;

/**
 * 咖啡店
 */
@AllArgsConstructor
public class CoffeeStore {

    private CoffeeFactory factory;

    /**
     * 点咖啡
     */
    public Coffee orderCoffee() {
        Coffee coffee = factory.build();
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
