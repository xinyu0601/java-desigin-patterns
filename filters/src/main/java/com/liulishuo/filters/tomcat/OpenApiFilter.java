package com.liulishuo.filters.tomcat;

/**
 * Created on 2019/7/26 20:48.
 *
 * @author hxyn4412
 */
public class OpenApiFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {
        System.out.println("Open Api filter");
        chain.doFilter(request, response);
    }

}
