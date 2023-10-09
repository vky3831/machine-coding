package DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation{
    List<Observer> observerList;

    WeatherStation(){
        observerList = new ArrayList<>();
    }
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    private void broadcast(int temperature) {
        for(Observer observer: observerList){
            observer.update(temperature);
        }
    }

    public void getUpdate(){
        Random random = new Random();
        int temperature = 15 + (int)(random.nextFloat() * 15);
        broadcast(temperature);
    }
}
