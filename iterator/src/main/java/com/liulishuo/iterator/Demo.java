package com.liulishuo.iterator;

import java.util.ArrayList;

/**
 * Created on 2019/7/22 13:19.
 *
 * @author hxyn4412
 */
public class Demo {

    public static void main(String args[]) {
        Container container = new NameContainer();
        ArrayList list = new ArrayList<String>();
        Iterator it = (Iterator) list.iterator();
        Iterator its = container.getIterator();
        while (its.hasNext()) {
            String item = (String) its.next();
            System.out.println(item);
        }
    }

}
