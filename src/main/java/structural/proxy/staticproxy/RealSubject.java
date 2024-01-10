package 结构型模式.代理模式.静态代理;

/**
 * 真实主题
 */
public class RealSubject implements Subject {
    
    @Override
    public void request() {
        System.out.println("真实主题执行请求操作...");
    }
}