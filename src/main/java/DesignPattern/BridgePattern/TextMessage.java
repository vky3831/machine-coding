package DesignPattern.BridgePattern;

public class TextMessage extends Notification {
    TextMessage(NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    void sendMessage() {
        System.out.print("This is a Text Message. ");
        notificationSender.sendNotification();
    }
}
