package com.liulishuo.filters;

/**
 * Created on 2019/7/22 12:29.
 *
 * @author hxyn4412
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
