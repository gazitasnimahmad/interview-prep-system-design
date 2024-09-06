package com.Interview.ObserverDesignpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationConcreteSubject implements Subject{
    List<Observer> observers = new ArrayList<>();
    String weather;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver(String weather) {
        for(Observer observer : observers){
            observer.update(weather);
        }
    }

    public void setWeather(String weather){
        notifyAllObserver(weather);
    }
}
