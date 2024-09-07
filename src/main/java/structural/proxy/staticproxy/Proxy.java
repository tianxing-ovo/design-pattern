package structural.proxy.staticproxy;

import structural.proxy.RealSubject;
import structural.proxy.Subject;

/**
 * 代理类
 */
public class Proxy implements Subject {

    private final RealSubject realSubject = new RealSubject();

    @Override
    public String request() {
        System.out.println("static proxy before");
        String returnValue = realSubject.request();
        System.out.println("static proxy after");
        return returnValue;
    }
}
