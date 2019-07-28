package com.liulishuo.chain.tomcat;


/**
 * Created on 2019/7/28 17:51.
 *
 * @author hxyn4412
 */
final class StandardContextValve extends ValveBase {

    @Override
    public void invoke(Request request, Response response) {
        System.out.println("Standard context valve");
        StandardWrapper wrapper = new StandardWrapper();
        wrapper.getPipeline().getFirst().invoke(new Request(), new Response());
    }

}
