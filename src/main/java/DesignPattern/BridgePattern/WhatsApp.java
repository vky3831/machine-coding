package DesignPattern.BridgePattern;

public class WhatsApp implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("Sending via WhatsApp");
    }
}
