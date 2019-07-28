package com.liulishuo.state;

/**
 * Created on 2019/7/22 12:50.
 *
 * @author hxyn4412
 */
public class LoadingState implements State {
    public void handle() {
        System.out.println("Loading");
    }
}
