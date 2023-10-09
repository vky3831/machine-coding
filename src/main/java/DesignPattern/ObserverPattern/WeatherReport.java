package DesignPattern.ObserverPattern;

public class WeatherReport implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Current temperature is " + temperature + "°C" );
    }
}
