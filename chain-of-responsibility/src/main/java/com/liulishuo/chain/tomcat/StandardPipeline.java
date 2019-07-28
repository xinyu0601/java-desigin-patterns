package com.liulishuo.chain.tomcat;

/**
 * Created on 2019/7/28 17:32.
 *
 * @author hxyn4412
 */
public class StandardPipeline implements Pipeline {
    private Valve next = null;
    private Valve basic = null;
    private Valve first = null;
    private Container container = null;

    public StandardPipeline() {

    }

    public StandardPipeline(Container container) {
        this();
        this.container = container;
    }

    @Override
    public Valve getNext() {
        return (this.next);
    }

    @Override
    public void addValvue(Valve valve) {
        if (first == null) {
            first = valve;
            valve.setNext(this.basic);
        } else {
            Valve current = first;
            while (current != null) {
                if (current.getNext() == this.basic) {
                    current.setNext(valve);
                    valve.setNext(this.basic);
                    break;
                }
                current = current.getNext();
            }
        }
    }

    @Override
    public Valve getBasic() {
        return (this.basic);
    }

    @Override
    public void setBasic(Valve valve) {
        Valve oldValve = this.basic;
        if (oldValve == valve)
            return;
        if (valve == null)
            return;
        Valve current = this.first;
        while (current != null) {
            if (current.getNext() == oldValve) {
                current.setNext(valve);
                break;
            }
            current = current.getNext();
        }
        this.basic = valve;
    }

    @Override
    public void setNext(Valve valve) {
        this.next = valve;
    }

    @Override
    public Valve getFirst() {
        if (first != null) {
            return first;
        }

        return basic;
    }

    @Override
    public Valve[] getValves() {
        return new Valve[0];
    }
}
