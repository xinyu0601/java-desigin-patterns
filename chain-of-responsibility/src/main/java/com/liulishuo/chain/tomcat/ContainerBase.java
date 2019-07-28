package com.liulishuo.chain.tomcat;

/**
 * Created on 2019/7/28 17:25.
 *
 * @author hxyn4412
 */
public abstract class ContainerBase extends LifeCycleBase implements Container {

    protected final Pipeline pipeline = new StandardPipeline(this);

    @Override
    public Pipeline getPipeline() {
        return (this.pipeline);
    }

}
