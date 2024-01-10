package 创建型模式.工厂方法模式;

public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore(new AmericanCoffeeFactory());
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
