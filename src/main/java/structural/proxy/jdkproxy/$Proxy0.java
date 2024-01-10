package structural.proxy.jdkproxy;

import structural.proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * 代理类
 */
public final class $Proxy0 extends Proxy implements Subject {
    private static final Method m1;
    private static final Method m2;
    private static final Method m3;
    private static final Method m0;

    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
            m2 = Class.forName("java.lang.Object").getMethod("toString");
            m3 = Class.forName("structural.proxy.Subject").getMethod("request");
            m0 = Class.forName("java.lang.Object").getMethod("hashCode");
        } catch (NoSuchMethodException noSuchMethodException) {
            throw new NoSuchMethodError(noSuchMethodException.getMessage());
        } catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }

    public $Proxy0(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    public void request() {
        try {
            this.h.invoke(this, m3, null);
        } catch (Error | RuntimeException throwable) {
            throw throwable;
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public boolean equals(Object object) {
        try {
            return (Boolean) this.h.invoke(this, m1, new Object[]{object});
        } catch (Error | RuntimeException throwable) {
            throw throwable;
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public String toString() {
        try {
            return (String) this.h.invoke(this, m2, null);
        } catch (Error | RuntimeException throwable) {
            throw throwable;
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public int hashCode() {
        try {
            return (Integer) this.h.invoke(this, m0, null);
        } catch (Error | RuntimeException throwable) {
            throw throwable;
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }
}
