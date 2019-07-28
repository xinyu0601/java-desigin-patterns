package com.liulishuo.chain.tomcat;

/**
 * Created on 2019/7/28 17:48.
 *
 * @author hxyn4412
 */
final class StandardEnginValve extends ValveBase {

    @Override
    public void invoke(Request request, Response response) {
        System.out.println("Standard engine valve");
        StandardHost host = new StandardHost();
        host.getPipeline().getFirst().invoke(new Request(), new Response());
    }

}
