package behavioral.chainofresponsibility.filter;

/**
 * 第一个过滤器
 */
public class FirstFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("过滤器1 前置处理");
        chain.doFilter(request, response);
        System.out.println("过滤器1 后置处理");
    }
}
