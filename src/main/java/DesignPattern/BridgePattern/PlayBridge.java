package DesignPattern.BridgePattern;

public class PlayBridge {

    public static void main(String[] args) {
        SMS sms = new SMS();
        Email email = new Email();
        WhatsApp whatsApp = new WhatsApp();

        TextMessage textMessage = new TextMessage(sms);
        QRCode qrCode = new QRCode(email);
        TextMessage textMessage2 = new TextMessage(whatsApp);

        textMessage.sendMessage();
        qrCode.sendMessage();
        textMessage2.sendMessage();
    }
}
