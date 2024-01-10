package structural.proxy.jdkproxy;

import lombok.SneakyThrows;

/**
 * 客户端
 */
public class Client {

    @SneakyThrows
    public static void main(String[] args) {
        Object proxy = ProxyFactory.getProxy();
        // com.sun.proxy.$Proxy0
        System.out.println(proxy.getClass().getName());
        proxy.getClass().getMethod("request").invoke(proxy);
    }
}