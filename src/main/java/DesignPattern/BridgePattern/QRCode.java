package DesignPattern.BridgePattern;

public class QRCode extends Notification {
    QRCode(NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    void sendMessage() {
        System.out.print("This is QR Code. ");
        notificationSender.sendNotification();
    }
}
