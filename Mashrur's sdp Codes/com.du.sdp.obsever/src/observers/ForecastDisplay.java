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
public class ForecastDisplay implements Observer, DisplayElement {

    private WeatherData weather;
    private float currTemp;
    private float prevTemp;

    public ForecastDisplay(WeatherData weather) {
        this.weather = weather;
        this.currTemp = this.prevTemp = 29.92f;
        weather.registerObserver(this);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        prevTemp = currTemp;
        currTemp = temperature;
        display();
    }

    @Override
    public void display() {
        if(currTemp > prevTemp) {
            System.out.println("Improving weather");
        }
        else if(currTemp == prevTemp) {
            System.out.println("Same weather");
        }
        else {
            System.out.println("Cooler, rainy weather");
        }
    }

}
