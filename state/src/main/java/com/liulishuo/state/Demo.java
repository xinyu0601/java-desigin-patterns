package com.liulishuo.state;

/**
 * Created on 2019/7/22 12:56.
 *
 * @author hxyn4412
 */
public class Demo {

    public static void main(String args[]) {
        Context context = new Context();
        context.setState(new WaitingState());
        context.handle();
        context.setState(new LoadingState());
        context.handle();
    }

}
