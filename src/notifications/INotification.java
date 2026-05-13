package notifications;
public interface INotification {
    void prepareMessage();
    void send();
    String getStatus();
}
