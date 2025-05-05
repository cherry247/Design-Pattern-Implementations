package factoryPattern;

public class Main {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification(NotificationType.SMS);
        notification.notifyUser();
        Notification notification1 = NotificationFactory.createNotification(NotificationType.EMAIL);
        notification1.notifyUser();
    }
}
