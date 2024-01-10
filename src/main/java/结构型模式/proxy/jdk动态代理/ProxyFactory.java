package 结构型模式.代理模式.jdk动态代理;

import 结构型模式.代理模式.RealSubject;
import 结构型模式.代理模式.Subject;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    private final static RealSubject realSubject = new RealSubject();

    /**
     * 获取代理对象
     */
    public static Subject getProxy() {
        return (Subject) Proxy.newProxyInstance(
            realSubject.getClass().getClassLoader(),
            realSubject.getClass().getInterfaces(),
            (proxy, method, args) -> {
                System.out.println("代理类在调用真实主题之前进行预处理...");
                Object o = method.invoke(realSubject, args);
                System.out.println("代理类在调用真实主题之后进行后续处理...");
                return o;
            });
    }
}
