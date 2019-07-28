package com.liulishuo.chain.tomcat;

/**
 * Created on 2019/7/28 17:51.
 *
 * @author hxyn4412
 */
public class StandardContext extends ContainerBase {

    public StandardContext() {
        super();
        pipeline.setBasic(new StandardContextValve());
    }

}
