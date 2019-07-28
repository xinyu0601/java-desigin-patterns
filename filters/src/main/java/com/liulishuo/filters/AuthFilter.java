package com.liulishuo.filters;

/**
 * Created on 2019/7/22 11:56.
 *
 * @author hxyn4412
 */
public class AuthFilter implements Filter {

    public void filter(String request) {
        System.out.println("Auth filter " + request);
    }

}
