/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observers;

import observable.WeatherData;

/**
 *
 * @author mashrur
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private WeatherData weather;

    public CurrentConditionDisplay(WeatherData weather) {
        this.weather = weather;
        weather.registerObserver(this);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temp = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Temperature: " + temp + " Humidity: " + humidity);
    }

}
