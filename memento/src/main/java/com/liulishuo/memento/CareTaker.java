package com.liulishuo.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/7/22 10:57.
 *
 * @author hxyn4412
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

}
