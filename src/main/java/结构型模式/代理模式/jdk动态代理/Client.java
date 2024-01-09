package 结构型模式.代理模式.jdk动态代理;

import 结构型模式.代理模式.Subject;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = ProxyFactory.getProxy();
        subject.request();
    }
}