package DesignPattern.ObserverPattern;

import java.util.Timer;
import java.util.TimerTask;

public class PlayObserver {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherReport weatherReport = new WeatherReport();
        weatherStation.addObserver(weatherReport);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                weatherStation.getUpdate();
            }
        }, 0, 5000);
    }
}
