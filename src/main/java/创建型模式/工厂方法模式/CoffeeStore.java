package 创建型模式.工厂方法模式;

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
