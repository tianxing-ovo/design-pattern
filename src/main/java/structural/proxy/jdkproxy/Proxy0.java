package structural.proxy.jdkproxy;

import structural.proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * 运行时动态生成的代理类
 *
 * @author tianxing
 */
public final class Proxy0 extends Proxy implements Subject {
    private static final long serialVersionUID = -2049481713298842790L;
    private static final Method M1;
    private static final Method M2;
    private static final Method M3;
    private static final Method M0;

    static {
        try {
            M1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
            M2 = Class.forName("java.lang.Object").getMethod("toString");
            M3 = Class.forName("structural.proxy.Subject").getMethod("request");
            M0 = Class.forName("java.lang.Object").getMethod("hashCode");
        } catch (NoSuchMethodException noSuchMethodException) {
            throw new NoSuchMethodError(noSuchMethodException.getMessage());
        } catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }

    public Proxy0(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    /**
     * 1. 调用Proxy.newProxyInstance()将InvocationHandler绑定到代理对象proxy上
     * 2. 调用proxy.request()
     * 3. 调用InvocationHandler.invoke()
     *
     * @return {@link String }
     */
    @Override
    public String request() {
        try {
            return (String) this.h.invoke(this, M3, null);
        } catch (Error | RuntimeException throwable) {
            throw throwable;
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    @Override
    public boolean equals(Object object) {
        try {
            return (Boolean) this.h.invoke(this, M1, new Object[]{object});
        } catch (Error | RuntimeException throwable) {
            throw throwable;
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    @Override
    public String toString() {
        try {
            return (String) this.h.invoke(this, M2, null);
        } catch (Error | RuntimeException throwable) {
            throw throwable;
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    @Override
    public int hashCode() {
        try {
            return (Integer) this.h.invoke(this, M0, null);
        } catch (Error | RuntimeException throwable) {
            throw throwable;
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }
}
