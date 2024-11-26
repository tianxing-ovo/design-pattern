package behavioral.chainofresponsibility.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 默认实现类
 */
public class ApplicationFilterChain implements FilterChain {

    private final List<Filter> filters = new ArrayList<>();
    private int index = 0;


    /**
     * 添加过滤器
     *
     * @param filter 过滤器
     * @return {@link ApplicationFilterChain }
     */
    public ApplicationFilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response) {
        if (index == filters.size()) {
            return;
        }
        filters.get(index++).doFilter(request, response, this);
    }
}
