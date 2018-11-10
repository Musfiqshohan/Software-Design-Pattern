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
public class StatisticsDisplay implements Observer, DisplayElement{
    
    
    private double maxTemp;
    private double minTemp;
    private double sumTemp;
    private double tempCount;
    
    
    private WeatherData weatherData;
    
    
     public StatisticsDisplay(WeatherData wd) {
        this.weatherData=wd;
        weatherData.registerObserver(this);
        minTemp=10000;
        maxTemp=0;
        sumTemp=0;
        tempCount=0;
                
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        maxTemp=Math.max(maxTemp, temp);
        minTemp=Math.min(minTemp, temp);
        
        sumTemp+=temp;
        tempCount++;
        
        display();
                
    }

    @Override
    public void display() {
        
        System.out.println("StatisticsReport");
        System.out.println("Average Temperature:"+sumTemp/tempCount);
        System.out.println("Min Temperature: "+minTemp);
        System.out.println("Max Temperature: "+maxTemp);
    }
    
}
