package structural.proxy.jdkproxy;

import lombok.SneakyThrows;
import structural.proxy.Subject;

/**
 * 客户端
 */
public class Client {

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @SneakyThrows
    public static void main(String[] args) {
        // 获取代理对象
        Subject proxy = ProxyFactory.getProxy();
        // com.sun.proxy.$Proxy0
        System.out.println(proxy.getClass().getName());
        // 调用request()方法
        System.out.println(proxy.request());
        // 暂停程序
        System.in.read();
    }
}