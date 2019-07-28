package com.liulishuo.chain.tomcat;

/**
 * Created on 2019/7/28 16:32.
 *
 * @author hxyn4412
 */
public abstract class ValveBase implements Valve {

    private Valve next = null;

    private Valve basic = null;

    @Override
    public Valve getNext() {
        return this.next;
    }

    @Override
    public Valve getBasic() {
        return this.basic;
    }

    @Override
    public void setNext(Valve valve) {
        this.next = valve;
    }

    @Override
    public void invoke(Request request, Response response) {

    }

    @Override
    public void backgroundProcess() {

    }
}
