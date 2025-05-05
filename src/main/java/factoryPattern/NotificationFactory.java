package factoryPattern;

public class NotificationFactory {
    public static Notification createNotification(NotificationType type){
        switch(type){
            case SMS -> {
                return new SMSNotification();
            }
            case EMAIL -> {
                return new EmailNotification();
            }
            default -> throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}
