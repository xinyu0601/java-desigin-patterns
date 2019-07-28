package com.liulishuo.chain.tomcat;

/**
 * Created on 2019/7/28 17:52.
 *
 * @author hxyn4412
 */
final class StandardWrapperValve extends ValveBase {

    @Override
    public void invoke(Request request, Response response) {
        System.out.println("Standard wrapper valve");
    }

}
