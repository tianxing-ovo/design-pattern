package structural.proxy.staticproxy;

import structural.proxy.RealSubject;
import structural.proxy.Subject;

/**
 * 代理
 */
public class Proxy implements Subject {

    private final RealSubject realSubject = new RealSubject();

    /**
     * 增强方法: 在调用真实主题的request方法之前的操作
     */
    private void beforeRequest() {
        System.out.println("代理类在调用真实主题之前进行预处理...");
    }

    @Override
    public void request() {
        beforeRequest();
        realSubject.request();
        afterRequest();
    }

    /**
     * 增强方法: 在调用真实主题的request方法之后的操作
     */
    private void afterRequest() {
        System.out.println("代理类在调用真实主题之后进行后续处理...");
    }
}
