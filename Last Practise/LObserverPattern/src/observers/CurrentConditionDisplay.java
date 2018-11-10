/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observers;

import subject.WeatherData;

/**
 *
 * @author musfiq
 */
public class CurrentConditionDisplay implements Observer, DisplayElement{
    
    
    private WeatherData weatherData;
    
    private double temperature;
    private double humidity;
    private double pressure;

    public CurrentConditionDisplay(WeatherData wd) {
        this.weatherData=wd;
        weatherData.registerObserver(this);
        
        
    }
    
    

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        
        
        display();
        
    }

    @Override
    public void display() {
        System.out.println("CurrentCondition: \n"
                + "temperature"+temperature
                + "\nHumidity:"+humidity           
                +"\nPressure: "+pressure);
    }
    
}
