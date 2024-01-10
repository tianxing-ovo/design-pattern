package creational.factorymethod;

public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore(new AmericanCoffeeFactory());
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
