package com.liulishuo.filters;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/7/22 11:58.
 *
 * @author hxyn4412
 */
public class FilterChain {

    private List<Filter> filterList = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter) {
        filterList.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filterList) {
            filter.filter(request);
        }
        this.target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }

}
