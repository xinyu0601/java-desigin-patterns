package com.liulishuo.filters.tomcat;

/**
 * Created on 2019/7/26 20:57.
 *
 * @author hxyn4412
 */
public class App {

    public static void main(String args[]) {
        Filter authFilter = new AuthFilter();
        Filter openApiFilter = new OpenApiFilter();
        FilterChain filterChain = FilterChain.createFilterChain();
        filterChain.addFilter(authFilter);
        filterChain.addFilter(openApiFilter);
        filterChain.doFilter(new ServletRequest(), new ServletResponse());
    }

}
