package behavioral.chainofresponsibility.filter;

/**
 * 过滤器链
 */
public interface FilterChain {
    void doFilter(Request request, Response response);
}
