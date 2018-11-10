/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observable;

import java.util.*;
import observers.Observer;

/**
 *
 * @author mashrur
 */
public class WeatherData implements Subject {

    private float temp;
    private float humidity;
    private float pressure;
    private ArrayList<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(temp, pressure, humidity);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temp, float pressure, float humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
