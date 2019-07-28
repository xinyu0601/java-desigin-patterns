package com.liulishuo.filters.tomcat;


/**
 * Created on 2019/7/26 20:37.
 *
 * @author hxyn4412
 */
public interface Filter {

    void doFilter(ServletRequest request, ServletResponse response, FilterChain chain);

}
