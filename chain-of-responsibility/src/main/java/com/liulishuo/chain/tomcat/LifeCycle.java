package com.liulishuo.chain.tomcat;

/**
 * Created on 2019/7/28 18:14.
 *
 * @author hxyn4412
 */
public interface LifeCycle {

    void init();

    void start();

    void stop();

    void destroy();

}
