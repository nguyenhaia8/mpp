package practice.prob6;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type == null) {
            throw new NullPointerException("type is null");
        }

        switch (type) {
            case "email":
                return new EmailNotification();
            case "push":
                return new PushNotification();
            case "sms":
                return new SMSNotification();
            case "inapp":
                return new InAppNotification();

            default:
                throw new IllegalArgumentException("Notification type " + type + " not supported");

        }
    }
}

// Using the factory pattern make easy to extend and
// We just need create new class and implement Notification and add more case in Factory
// It made open for extension but closed for modification
