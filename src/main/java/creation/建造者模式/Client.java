package 创建型模式.建造者模式;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(new Director(new MobileBuilder()).construct());//Bike(frame=碳纤维车架, seat=真皮车座)
        System.out.println(new Director(new OfoBuilder()).construct());//Bike(frame=铝合金车架, seat=橡胶车座)
        System.out.println(User.builder().id(1).name("张三").age(18).build());//User(id=1, name=张三, age=18)
    }
}
