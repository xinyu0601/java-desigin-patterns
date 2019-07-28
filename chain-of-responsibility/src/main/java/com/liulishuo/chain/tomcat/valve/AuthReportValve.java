package com.liulishuo.chain.tomcat.valve;

import com.liulishuo.chain.tomcat.Request;
import com.liulishuo.chain.tomcat.Response;
import com.liulishuo.chain.tomcat.ValveBase;

/**
 * Created on 2019/7/28 19:18.
 *
 * @author hxyn4412
 */
public class AuthReportValve extends ValveBase {

    @Override
    public void invoke(Request request, Response response) {
        System.out.println("Auth report valve");
        getNext().invoke(request, response);
    }

}
