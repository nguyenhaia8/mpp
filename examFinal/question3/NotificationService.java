package examFinal.question3;

public enum NotificationService {
    INSTANCE;
    public void sendAlert(String message) {
        System.out.println(message);
    }
}

class Notification {
    private Notification() {}
    private static Notification instance;
    public static Notification getInstance() {
        if (instance == null) {
            instance = new Notification();
        }
        return instance;
    }
}

class Main {
    public static void main(String[] args) {
        Notification notification = Notification.getInstance();
        NotificationService notification1 = NotificationService.INSTANCE;

        notification1.sendAlert("Emergency in Ward7!");
    }
}

// Using enum for singleton is preferred over a traditional singleton class
// because enum its self is a singleton, it make type safety more than traditional singleton class
