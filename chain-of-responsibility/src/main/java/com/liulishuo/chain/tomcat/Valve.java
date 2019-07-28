package com.liulishuo.chain.tomcat;

/**
 * Created on 2019/7/28 15:53.
 *
 * @author hxyn4412
 */
public interface Valve {

    Valve getNext();

    Valve getBasic();

    void setNext(Valve valve);

    void invoke(Request request, Response response);

    void backgroundProcess();

}
