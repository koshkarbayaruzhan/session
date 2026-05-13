package notifications;

public class EmailNotification implements INotification {

    @Override
    public void prepareMessage() {
        System.out.println("Подготовка Email сообщения");
    }

    @Override
    public void send() {
        System.out.println("Email отправлен");
    }

    @Override
    public String getStatus() {
        return "Email успешно отправлен";
    }
}
