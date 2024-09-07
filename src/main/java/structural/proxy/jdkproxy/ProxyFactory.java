package structural.proxy.jdkproxy;

import structural.proxy.RealSubject;
import structural.proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private final static RealSubject realSubject = new RealSubject();

    /**
     * 获取代理对象
     */
    public static Subject getProxy() {
        // 代理类的类加载器
        ClassLoader loader = realSubject.getClass().getClassLoader();
        // 代理类要实现的接口列表
        Class<?>[] interfaces = realSubject.getClass().getInterfaces();
        return (Subject) Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
            /**
             * 处理通过代理对象调用的所有方法
             *
             * @param proxy  代理对象
             * @param method 调用方法的Method对象
             * @param args   调用方法时传入的参数数组
             * @return 调用方法的返回值
             * @throws Throwable throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("jdk proxy before");
                // 调用真实主题的方法
                Object returnValue = method.invoke(realSubject, args);
                System.out.println("jdk proxy after");
                return returnValue;
            }
        });
    }
}
