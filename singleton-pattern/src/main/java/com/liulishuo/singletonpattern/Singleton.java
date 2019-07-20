package com.liulishuo.singletonpattern;

/**
 * @author hxyn4412
 * @date 2019/7/20-14:48
 */
public class Singleton {

    private static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

}
