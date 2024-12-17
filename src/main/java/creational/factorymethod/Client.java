package creational.factorymethod;

/**
 * 客户端
 *
 * @author tianxing
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore(new AmericanCoffeeFactory());
        Coffee coffee = store.orderCoffee();
        // 美式咖啡
        System.out.println(coffee.getName());
    }
}
