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
public class ForeCastDisplay implements Observer,DisplayElement{
    
    private WeatherData weatherData;
    private double currTemp;
    private double prevTemp;
    
    
     public ForeCastDisplay(WeatherData wd, double currtemp) {
        this.weatherData=wd;
        weatherData.registerObserver(this);
        this.prevTemp=currtemp;
        this.currTemp=currtemp;
   
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        prevTemp=currTemp;
        currTemp=temp;
        
        display();
    }

    @Override
    public void display() {
        
        System.out.println("Forecast:");
        if(currTemp>prevTemp){
            System.out.println("Improving weather on the way!");
           
        }
        else if(currTemp==prevTemp){
            System.out.println("More of the same weather");
            
        }
        else
            System.out.println("Watch out for cooler, rainy weather");
        
    }
    
    
}
