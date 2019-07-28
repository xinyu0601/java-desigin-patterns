package com.liulishuo.iterator;

/**
 * Created on 2019/7/22 13:13.
 *
 * @author hxyn4412
 */
public class NameContainer implements Container {

    public String names[] = {"Robert", "John", "Julie", "Lora"};

    public Iterator getIterator() {
        return new NameIterator();
    }

    class NameIterator implements Iterator {

        private int index;

        public boolean hasNext() {
            if (index < names.length)
                return true;
            return false;
        }

        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

}
