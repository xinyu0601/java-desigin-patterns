package com.liulishuo.chain.tomcat;

/**
 * Created on 2019/7/28 17:52.
 *
 * @author hxyn4412
 */
public class StandardWrapper extends ContainerBase {

    public StandardWrapper() {
        super();
        pipeline.setBasic(new StandardWrapperValve());
    }

}
