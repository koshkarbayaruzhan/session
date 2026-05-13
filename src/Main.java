package notifications;

public class Main {

    public static void main(String[] args) {

        INotification notification =
                NotificationFactory.createNotification("sms");

        notification.prepareMessage();
        notification.send();

        System.out.println(notification.getStatus());
    }
}
