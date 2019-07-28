package com.liulishuo.memento;

/**
 * Created on 2019/7/22 10:52.
 *
 * @author hxyn4412
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
