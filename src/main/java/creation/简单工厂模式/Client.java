package 创建型模式.简单工厂模式;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeStore.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
