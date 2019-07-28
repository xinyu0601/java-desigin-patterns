package com.liulishuo.chain.tomcat;

/**
 * Created on 2019/7/28 16:01.
 *
 * @author hxyn4412
 */
public interface Pipeline {

    Valve getBasic();

    void setBasic(Valve valve);

    Valve getNext();

    void setNext(Valve valve);

    void addValvue(Valve valve);

    Valve getFirst();

    Valve[] getValves();

}
