package creational.simplefactory;

import org.junit.jupiter.api.Test;

/**
 * @author tianxing
 */
public class CoffeeStoreTest {

    @Test
    public void orderCoffee() {
        // 客户点了一杯美式咖啡
        Coffee americanCoffee = CoffeeStore.orderCoffee(CoffeeType.AMERICAN);
        System.out.println(americanCoffee.getName());
        // 客户点了一杯拿铁咖啡
        Coffee latteCoffee = CoffeeStore.orderCoffee(CoffeeType.LATTE);
        System.out.println(latteCoffee.getName());
    }
}