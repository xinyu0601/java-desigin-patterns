package com.liulishuo.filters;

/**
 * Created on 2019/7/22 12:31.
 *
 * @author hxyn4412
 */
public class InterceptingFilterDemo {

    public static void main(String args[]) {
        Client client = new Client();
        Target target = new Target();
        FilterManager filterManager = new FilterManager(target);
        client.setFilterManager(filterManager);
        filterManager.addFilter(new AuthFilter());
        filterManager.addFilter(new ErrorFilter());
        filterManager.filterRequest("test01");
    }

}
