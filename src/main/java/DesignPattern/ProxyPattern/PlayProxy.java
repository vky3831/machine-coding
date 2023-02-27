package DesignPattern.ProxyPattern;

// Structural Design Pattern
public class PlayProxy {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectTo("banned.com");
        internet.connectTo("google.com");
    }
}
