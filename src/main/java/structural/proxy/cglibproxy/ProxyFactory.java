package structural.proxy.cglibproxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import structural.proxy.RealSubject;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {


    /**
     * 获取代理对象
     */
    public Object getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib proxy before");
        Object o = methodProxy.invokeSuper(obj, args);
        System.out.println("cglib proxy after");
        return o;
    }
}
