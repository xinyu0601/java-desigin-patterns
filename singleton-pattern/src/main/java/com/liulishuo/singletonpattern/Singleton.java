package com.liulishuo.singletonpattern;

public class Singleton {

    private static Singleton singleton;

    public Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

}
