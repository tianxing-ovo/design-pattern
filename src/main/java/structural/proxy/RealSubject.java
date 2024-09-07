package structural.proxy;

/**
 * 真实主题
 */
public class RealSubject implements Subject {

    @Override
    public String request() {
        System.out.println("真实主题执行请求操作");
        return "RealSubject Request ReturnValue";
    }
}