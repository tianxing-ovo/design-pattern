package behavioral.chainofresponsibility.filter;

/**
 * 第二个过滤器
 */
public class SecondFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("过滤器2 前置处理");
        chain.doFilter(request, response);
        System.out.println("过滤器2 后置处理");
    }
}
