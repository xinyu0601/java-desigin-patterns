package com.liulishuo.state;

/**
 * Created on 2019/7/22 12:51.
 *
 * @author hxyn4412
 */
public class ProcessingState implements State {

    public void handle() {
        System.out.println("Processing");
    }

}
