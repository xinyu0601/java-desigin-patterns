package com.liulishuo.mediator;

        import java.util.Date;

/**
 * Created on 2019/7/22 11:09.
 *
 * @author hxyn4412
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }

}
