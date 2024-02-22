package structural.proxy.cglibproxy;

import lombok.SneakyThrows;

public class Client {

    @SneakyThrows
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        Object o = proxyFactory.getProxy();
        System.out.println(o.getClass().getName());
        o.getClass().getMethod("request").invoke(o);
    }
}
