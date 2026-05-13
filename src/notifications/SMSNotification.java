package notifications;

public class SMSNotification implements INotification {

    @Override
    public void prepareMessage() {
        System.out.println("Подготовка SMS сообщения");
    }

    @Override
    public void send() {
        System.out.println("SMS отправлено");
    }

    @Override
    public String getStatus() {
        return "SMS успешно отправлено";
    }
}
