package com.liulishuo.filters;

/**
 * Created on 2019/7/22 12:27.
 *
 * @author hxyn4412
 */
public class FilterManager {

    private FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void addFilter(Filter fiter) {
        filterChain.addFilter(fiter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }

}
