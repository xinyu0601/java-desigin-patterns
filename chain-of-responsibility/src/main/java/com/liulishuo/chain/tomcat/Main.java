package com.liulishuo.chain.tomcat;

/**
 * Created on 2019/7/28 18:58.
 *
 * @author hxyn4412
 */
public class Main {

    public static void main(String args[]) {
        StandardEngine engine = new StandardEngine();
        if (engine.getPipeline().getFirst() != null)
            engine.getPipeline().getFirst().invoke(new Request(), new Response());
        else
            engine.getPipeline().getBasic().invoke(new Request(), new Response());
    }

}
