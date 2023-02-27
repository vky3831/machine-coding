package DesignPattern.BridgePattern;

public class Email implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("Sending via E-mail");
    }
}
