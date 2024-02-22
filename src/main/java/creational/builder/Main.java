package creational.builder;


public class Main {
    public static void main(String[] args) {
        // Bike(frame=碳纤维车架, seat=真皮车座)
        System.out.println(new Director(new MobileBuilder()).construct());
        // Bike(frame=铝合金车架, seat=橡胶车座)
        System.out.println(new Director(new OfoBuilder()).construct());
        // User(id=1, name=张三, age=18)
        System.out.println(User.builder().id(1).name("张三").age(18).build());
    }
}
