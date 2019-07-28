package com.liulishuo.chain.tomcat;

import com.liulishuo.chain.tomcat.valve.AuthReportValve;
import com.liulishuo.chain.tomcat.valve.ErrorReportValve;

/**
 * Created on 2019/7/28 17:50.
 *
 * @author hxyn4412
 */
public class StandardHost extends ContainerBase {

    public StandardHost() {
        super();
        StandardHostValve valve = new StandardHostValve();
        pipeline.setBasic(valve);
        Valve errValve = new ErrorReportValve();
        Valve authValve = new AuthReportValve();
        pipeline.addValvue(errValve);
        pipeline.addValvue(authValve);
    }

}
