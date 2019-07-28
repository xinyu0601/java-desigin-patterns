package com.liulishuo.filters.tomcat;

/**
 * Created on 2019/7/26 20:44.
 *
 * @author hxyn4412
 */
public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {
        System.out.println("Auth filter");
        chain.doFilter(request, response);
    }

}
