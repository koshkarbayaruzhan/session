package notifications;

public class PushNotification implements INotification {

    @Override
    public void prepareMessage() {
        System.out.println("Подготовка Push уведомления");
    }

    @Override
    public void send() {
        System.out.println("Push уведомление отправлено");
    }

    @Override
    public String getStatus() {
        return "Push успешно отправлен";
    }
}
