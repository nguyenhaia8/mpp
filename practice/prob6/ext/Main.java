package practice.prob6.ext;

import midterm.prob6.Notification;
import midterm.prob6.NotificationFactory;

public class Main {
    public static void main(String[] args) {
        Notification notification1 = NotificationFactory.createNotification("email");
        Notification notification2 = NotificationFactory.createNotification("sms");
        Notification notification3 = NotificationFactory.createNotification("push");
        notification1.send("123");
        notification2.send("456");
        notification3.send("789");
        Notification notification4 = NotificationFactory.createNotification("inapp");
        notification4.send("111");
    }
}
