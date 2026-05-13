package notifications;

public class NotificationFactory {

    public static INotification createNotification(String type) {

        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();

            case "sms":
                return new SMSNotification();

            case "push":
                return new PushNotification();

            default:
                return new WebNotification();
        }
    }
}
