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
public class StatisticsDisplay implements Observer, DisplayElement {

    private float minTemp;
    private float maxTemp;
    private float sumTemp;
    private float numberOfReadings;
    private WeatherData weather;

    public StatisticsDisplay(WeatherData weather) {
        this.weather = weather;
        numberOfReadings = 0;
        sumTemp = 0f;
        minTemp = 1000000000f;
        maxTemp = 0f;
        weather.registerObserver(this);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        sumTemp += temperature;
        numberOfReadings += 1.0;
        minTemp = Math.min(minTemp, temperature);
        maxTemp = Math.max(maxTemp, temperature);
        display();
    }

    @Override
    public void display() {
        System.out.println("Average temperature: " + sumTemp / numberOfReadings + " Minimum temperature: " + minTemp + " Maximum temperature: " + maxTemp);
    }

}
