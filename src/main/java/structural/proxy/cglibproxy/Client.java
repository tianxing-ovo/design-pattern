package structural.proxy.cglibproxy;

import lombok.SneakyThrows;
import structural.proxy.RealSubject;

/**
 * CGLib(Code Generation Library)动态代理: 适用于任何类(生成的代理类是目标类的子类)
 */
public class Client {

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @SneakyThrows
    public static void main(String[] args) {
        // 获取代理对象
        RealSubject proxy = new ProxyFactory().getProxy();
        // structural.proxy.RealSubject$$EnhancerByCGLIB$$41ddc223
        System.out.println(proxy.getClass().getName());
        // 调用request()方法
        System.out.println(proxy.request());
        // 暂停程序
        System.in.read();
    }
}
