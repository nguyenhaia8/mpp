package practice.prob6;

public class InAppNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("InApp sent: <" + message + ">");
    }
}
