package 创建型模式.单例模式.饿汉式.静态代码块;

public class Client {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance()==Singleton.getInstance());//true
    }
}
