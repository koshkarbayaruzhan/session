package notifications;

public class WebNotification implements INotification {

    @Override
    public void prepareMessage() {
        System.out.println("Подготовка Web уведомления");
    }

    @Override
    public void send() {
        System.out.println("Web уведомление отправлено");
    }

    @Override
    public String getStatus() {
        return "Web уведомление успешно отправлено";
    }
}
