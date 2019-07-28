package com.liulishuo.mediator;

/**
 * Created on 2019/7/22 11:10.
 *
 * @author hxyn4412
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}
