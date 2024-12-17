package structural.proxy.cglibproxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import structural.proxy.RealSubject;

import java.lang.reflect.Method;

/**
 * 代理工厂
 *
 * @author tianxing
 */
public class ProxyFactory implements MethodInterceptor {

    /**
     * 获取代理对象
     */
    public RealSubject getProxy() {
        // 类似JDK动态代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(RealSubject.class);
        // 设置回调(传递MethodInterceptor接口的实现类对象作为方法参数)
        enhancer.setCallback(this);
        return (RealSubject) enhancer.create();
    }


    /**
     * 拦截
     *
     * @param proxy       代理对象
     * @param method      调用方法的Method对象
     * @param args        调用方法时传入的参数数组
     * @param methodProxy 方法代理
     * @return 调用方法的返回值
     * @throws Throwable throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib proxy before");
        // 直接调用真实主题的方法(跳过当前类拦截器)
        Object returnValue = methodProxy.invokeSuper(proxy, args);
        System.out.println("cglib proxy after");
        return returnValue;
    }
}
