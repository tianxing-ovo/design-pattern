package behavioral.chainofresponsibility.filter;

public class Client {

    public static void main(String[] args) {
        // 创建过滤器链
        ApplicationFilterChain filterChain = new ApplicationFilterChain();
        // 添加过滤器
        filterChain.addFilter(new FirstFilter()).addFilter(new SecondFilter());
        // 执行过滤器链
        filterChain.doFilter(null, null);
    }
}
