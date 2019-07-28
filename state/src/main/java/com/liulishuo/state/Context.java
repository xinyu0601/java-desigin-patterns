package com.liulishuo.state;

/**
 * Created on 2019/7/22 12:54.
 *
 * @author hxyn4412
 */
public class Context {

    private State state;

    public Context() {

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle() {
        this.state.handle();
    }
}
