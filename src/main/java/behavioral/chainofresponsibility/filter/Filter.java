package behavioral.chainofresponsibility.filter;

/**
 * 过滤器
 *
 * @author tianxing
 */
public interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);
}
