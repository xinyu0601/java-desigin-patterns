package com.liulishuo.filters.tomcat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/7/26 20:37.
 *
 * @author hxyn4412
 */
public class FilterChain {
    private int pos;
    private final int maxSize;
    private List<Filter> filters = new ArrayList<>();
    private static volatile FilterChain filterChain;

    private FilterChain() {
        this.pos = 0;
        this.maxSize = 100;
    }

    public static FilterChain createFilterChain() {
        if (filterChain == null) {
            synchronized (FilterChain.class) {
                if (filterChain == null)
                    filterChain = new FilterChain();
            }
        }
        return filterChain;
    }

    public void doFilter(ServletRequest request, ServletResponse response) {
        if (pos < filters.size()) {
            System.out.println("do filter");
            filters.get(pos++).doFilter(request, response, this);
        }
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

}
