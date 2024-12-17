package structural.proxy;

/**
 * 真实主题
 *
 * @author tianxing
 */
public class RealSubject implements Subject {

    @Override
    public String request() {
        System.out.println("真实主题执行请求操作");
        return "RealSubject Request ReturnValue";
    }
}