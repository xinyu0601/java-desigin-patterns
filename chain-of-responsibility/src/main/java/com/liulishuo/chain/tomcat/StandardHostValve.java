package com.liulishuo.chain.tomcat;

/**
 * Created on 2019/7/28 17:50.
 *
 * @author hxyn4412
 */
final class StandardHostValve extends ValveBase {

    @Override
    public void invoke(Request request, Response response) {
        System.out.println("Standard host valve");
        StandardContext context = new StandardContext();
        if (context.getPipeline().getFirst() != null)
            context.getPipeline().getFirst().invoke(new Request(), new Response());
        else
            context.getPipeline().getBasic().invoke(new Request(), new Response());
    }

}
