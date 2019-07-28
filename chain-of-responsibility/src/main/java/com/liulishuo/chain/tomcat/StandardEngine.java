package com.liulishuo.chain.tomcat;

/**
 * Created on 2019/7/28 17:48.
 *
 * @author hxyn4412
 */
public class StandardEngine extends ContainerBase {

    public StandardEngine() {
        super();
        pipeline.setBasic(new StandardEnginValve());
    }

}
