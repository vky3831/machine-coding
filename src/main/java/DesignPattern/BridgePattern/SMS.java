package DesignPattern.BridgePattern;

public class SMS implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("Sending via SMS");
    }
}
