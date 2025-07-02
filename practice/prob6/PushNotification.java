package practice.prob6;

public class PushNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Push sent: <" + message + ">");
    }
}
