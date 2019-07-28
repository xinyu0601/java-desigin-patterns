package com.liulishuo.mediator;

/**
 * Created on 2019/7/22 11:10.
 *
 * @author hxyn4412
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }

}
